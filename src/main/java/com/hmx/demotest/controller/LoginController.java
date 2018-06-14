package com.hmx.demotest.controller;


import com.hmx.demotest.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class LoginController {
    @Resource
    IUserService userService;

    @RequestMapping("/tologin")
    String tologin(){
        System.out.println(123123);
        return "test";
    }

    @RequestMapping("/doLogin")
    @ResponseBody
    String doLogin(String acct,String pwd){
      Boolean flag=userService.doLogin(acct,pwd);
      return ""+flag;
    }
}
