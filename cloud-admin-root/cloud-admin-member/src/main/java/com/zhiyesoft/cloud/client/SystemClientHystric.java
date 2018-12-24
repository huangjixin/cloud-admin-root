package com.zhiyesoft.cloud.client;
import org.springframework.stereotype.Component;


@Component
public class SystemClientHystric implements ISystemClient {


    @Override
    public void save() {
        System.out.println("进入断路器-save。。。");
//        throw new RuntimeException("save 保存失败.");
    }
}