package com.example.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello World";
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
        //From application properties
        //spring.mvc.view.prefix = /WEB-INF/jsp
        //spring.mvc.view.suffix = .jsp
        //String joins with prefix and suffix and will be redirected to the sayHello jsp page
    }

}
