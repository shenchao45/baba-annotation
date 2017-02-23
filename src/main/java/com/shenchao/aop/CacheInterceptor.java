package com.shenchao.aop;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.spy.memcached.MemcachedClient;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by shenchao on 2017/2/12.
 */
@Component
@Aspect
public class CacheInterceptor {
    @Autowired
    private MemcachedClient memcachedClient;


    @Pointcut("execution(* com.shenchao.service.*.get*(..))")
    public void pointCut() {
    }
    @Pointcut("execution(* com.shenchao.service.*.del*(..))")
    public void afterDel(){}
    @Around("pointCut()")
    public Object doAround(ProceedingJoinPoint point) throws Throwable {
        String cacheKey = getCacheKey(point);
        Object o = memcachedClient.get(cacheKey);
        if (o == null) {
            Object result = point.proceed();
            memcachedClient.set(cacheKey, 720000, result);
            return result;
        }
        return o;
    }

    @After("afterDel()")
    public void after(JoinPoint joinpoint) {
        System.out.println("删除缓存");
    }

    public String getCacheKey(ProceedingJoinPoint joinPoint) throws IOException {
        String pageName = joinPoint.getTarget().getClass().getPackage().getName();
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        ObjectMapper mapper = new ObjectMapper();
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        StringWriter writer = new StringWriter();
        mapper.writeValue(writer, args);
        return pageName+":"+methodName+":"+writer.toString();
    }

}
