package com.my.poc.springremotinghttpinvokerservice;

import com.my.poc.springremotinghttpinvokerservice.httpinvokerclient.HelloWorldInterface;

public class HelloWorldImpl implements HelloWorldInterface {

    @Override
    public String sayHello(String name) {
        return "Hello World " + name;
    }
}
