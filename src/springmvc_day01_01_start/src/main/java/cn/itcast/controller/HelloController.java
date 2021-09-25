package cn.itcast.controller;

        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping(path="hello")
public class HelloController {
        @ResponseBody
        @RequestMapping(value = "test")
        public String testRequestMapping(){
                System.out.println("testRequestMapping");
                return "success";
        }
        @ResponseBody
        @RequestMapping(value="hello")
        public String sayHello(){
                System.out.println("Hello World");
                return "success";
        }

}
