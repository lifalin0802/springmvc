package com.atguigu.controller;


        import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class HelloController {
    @ResponseBody
    @RequestMapping("hello")
    public String Hello(){
        return "Hello World";
    }
}
