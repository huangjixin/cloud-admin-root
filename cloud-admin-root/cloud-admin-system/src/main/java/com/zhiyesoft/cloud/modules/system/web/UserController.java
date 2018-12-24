package com.zhiyesoft.cloud.modules.system.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyesoft.cloud.modules.system.service.IUserService;

/**
 * Created by lorne on 2017/6/26.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;



    @RequestMapping("/save")
    @ResponseBody
    public int save(){
        return userService.save();
    }
}
