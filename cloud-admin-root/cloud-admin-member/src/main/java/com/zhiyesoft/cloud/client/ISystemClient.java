package com.zhiyesoft.cloud.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by lorne on 2017/6/27.
 */
@FeignClient(value = "system-service",fallback=SystemClientHystric.class)
public interface ISystemClient {

    @RequestMapping(value = "/user/save",method = RequestMethod.GET)
    public void save();
}
