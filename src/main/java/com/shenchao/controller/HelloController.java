package com.shenchao.controller;

import com.shenchao.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by shenchao on 2017/2/9.
 */
@Controller
public class HelloController {

    @GetMapping("testPojo")
    @ResponseBody
    public User testPojo() {
        return new User(1, "沈超", new Date());
    }

    @PostMapping("testReceive")
    @ResponseBody
    public User testReceive(@RequestBody User user) {
        System.out.println(user);
        return user;
    }



    @GetMapping("/testThymeleaf")
    public String mainView(Model model){
        model.addAttribute("footer", "哈哈是的范德萨");
        return "main.html";
    }
}
