package com.yec.zyf.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class index {

    @RequestMapping("index")
    public String index(){
        return "/index";
    }


    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(String username){
        System.out.println(username);
        return null;
    }

}
