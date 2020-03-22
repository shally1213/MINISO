package com.shop.miniso.controller;

import com.shop.miniso.entity.User;
import com.shop.miniso.serice.IUserSerice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping
public class UserController {

    @Autowired
    private IUserSerice userSerice;

    @RequestMapping("")
    public String homePage(){

        return "login";

    }

    @RequestMapping("login")
    public String loginPage(String uAccount, String uLoginPwd, Model model){

        User user = userSerice.login(uAccount,uLoginPwd);

        List<User> userList = userSerice.findAll();

        System.out.println(user);

        model.addAttribute("user",user);

        model.addAttribute("userList",userList);

        return "index";

    }

}
