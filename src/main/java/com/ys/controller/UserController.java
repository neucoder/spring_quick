package com.ys.controller;

import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/save")
    public String save(){
        System.out.println("user save ...");
        JSONObject res = new JSONObject();
        res.put("hello", "world");
        return res.toString();
    }
}
