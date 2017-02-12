package com.shenchao.jersey;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by shenchao on 2017/2/11.
 */
public class TestJersey {
    public static void main(String[] args) throws IOException {
        Client client = new Client();
        WebResource resource = client.resource("http://localhost:8088/image-web/upload/qq.jpg");
        String path = "C:\\Users\\shenchao\\Desktop\\wzh.png";
        byte[] bytes = IOUtils.toByteArray(new FileInputStream(path));
        resource.put(bytes);
        System.out.println("上传成功");

    }
}
