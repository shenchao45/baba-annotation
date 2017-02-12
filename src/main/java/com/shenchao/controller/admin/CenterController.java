package com.shenchao.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shenchao on 2017/2/11.
 */
@Controller
@RequestMapping("/control")
public class CenterController {
    @GetMapping("/index.do")
    public String index(){
        return "back_page/index";
    }
    @GetMapping("/top.do")
    public String top(){
        return "back_page/top";
    }
    @GetMapping("/main.do")
    public String main(){
        return "back_page/main";
    }
    @GetMapping("/left.do")
    public String left(){
        return "back_page/left";
    }
    @GetMapping("/right.do")
    public String right(){
        return "back_page/right";
    }
}
