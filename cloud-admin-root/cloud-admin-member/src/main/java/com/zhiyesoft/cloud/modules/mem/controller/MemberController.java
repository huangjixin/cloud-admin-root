package com.zhiyesoft.cloud.modules.mem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zhiyesoft.cloud.modules.mem.service.IMemberService;

/**
 * Created by lorne on 2017/6/26.
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private IMemberService memberService;



    @RequestMapping("/save")
    @ResponseBody
    public int save(){
        return memberService.save();
    }
}
