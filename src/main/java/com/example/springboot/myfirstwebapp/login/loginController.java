package com.example.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {


    @RequestMapping("login")
    public String goToLoginPage(@RequestParam String name,@RequestParam String pass, ModelMap model){
        model.put("name", name);
        model.put("pass", pass);
        return "login";
    }
}
