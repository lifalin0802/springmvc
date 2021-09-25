package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class IndexController {
    @RequestMapping("/")
    String get() {
        //mapped to hostname:port/home/
        return "Hello from get";
    }
    @RequestMapping("/index")
    String index() {
        //mapped to hostname:port/home/index/
        return "Hello from index";
    }
}