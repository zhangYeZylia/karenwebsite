package com.karen.ssm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.karen.ssm.model.User;
import com.karen.ssm.service.UserService;

/**
 * @author xsansan
 * @date 2018年8月8日
 * Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/showhello")
    @ResponseBody
    public ModelAndView getIndex(){   
        /*ModelAndView mav = new ModelAndView("index");   
        User user = userService.selectUserById(1);  
        System.out.println(user.getUserName() + user.getUserPassword());
        mav.addObject("user", user);*/
        ModelAndView mav = new ModelAndView();
        mav.addObject("hello", "Hello world!");
        mav.setViewName("index");
        return mav;
    }


    @RequestMapping("/userhello")
    public ModelAndView getIndex1(){
        ModelAndView mav = new ModelAndView("index");
        User user = userService.selectUserById(1);
        System.out.println(user.getUserName() + user.getUserPassword());
        mav.addObject("hello", "Hello Spring MVC!!!");
        mav.addObject("user", user);

        return mav;
    }

}