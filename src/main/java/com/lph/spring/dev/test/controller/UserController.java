package com.lph.spring.dev.test.controller;


import com.alibaba.fastjson.JSONObject;
import com.lph.spring.dev.test.entity.UserEntity;
import com.lph.spring.dev.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/test")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/tt",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public void updateUserInfo(@RequestBody JSONObject jsonObject) {
        //获取前台的值
        Integer userId = jsonObject.getInteger("userId");
        String phone = jsonObject.getString("phone");
        Integer idcard = jsonObject.getInteger("idcard");
        String email = jsonObject.getString("email");
        Integer age = jsonObject.getInteger("age");
        String restr = "";
        System.out.println("============11111");
        //修改phone
         userService.updatePhone(userId,phone);
    }
    @RequestMapping(value = "")
    public List<UserEntity> getall() {
        return userService.findAll();
    }
}
