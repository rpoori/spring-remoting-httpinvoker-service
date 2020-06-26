package com.my.poc.springremotinghttpinvokerservice.httpinvokerclient;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public interface HelloWorldInterface {
    String sayHello(String name);
}
