package me.cxis.spi.service.impl;


import me.cxis.spi.service.HelloWorldService;

/**
 * Created by cheng.xi on 2017-02-25 15:12.
 */
public class CustomHelloWorldServiceImpl implements HelloWorldService {
    @Override
    public void sayHello() {
        System.out.println("custom HelloWorldServiceImpl");
    }
}
