package com.shenchao.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by shenchao on 2017/2/11.
 */
@Controller
@RequestMapping("/control")
public class FrameController {

    @GetMapping("/frame/product_main.do")
    public String productMain(){
        return "back_page/frame/product_main";
    }
    @GetMapping("/frame/product_left.do")
    public String productLeft(){
        return "back_page/frame/product_left";
    }
    @GetMapping("/frame/order_main.do")
    public String orderMain(){
        return "back_page/frame/order_main";
    }
    @GetMapping("/frame/order_left.do")
    public String orderLeft(){
        return "back_page/frame/order_left";
    }
}
