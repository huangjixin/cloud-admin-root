package com.zhiyesoft.cloud.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zhiyesoft.cloud.modules.mem.domain.Test;

import java.util.List;

/**
 * Created by lorne on 2017/6/27.
 */
@FeignClient(value = "demo2",fallback = Demo2ClientHystric.class)
public interface Demo2Client {


    @RequestMapping(value = "/demo/list",method = RequestMethod.GET)
    List<Test> list();


    @RequestMapping(value = "/demo/save",method = RequestMethod.GET)
    int save();
}
