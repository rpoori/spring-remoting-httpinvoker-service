package com.my.poc.springremotinghttpinvokerservice;

import com.my.poc.springremotinghttpinvokerservice.httpinvokerclient.HelloWorldInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

@Configuration
public class BeanConfig {

    @Autowired
    private HelloWorldInterface helloWorldInterface;

    @Bean(name = "/HelloWorld")
    public HttpInvokerServiceExporter helloWorldHttpInvokerServiceExporter() {
        HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
        exporter.setService(helloWorldInterface);
        exporter.setServiceInterface(HelloWorldInterface.class);
        return exporter;
    }

    @Bean
    public HelloWorldInterface helloWorldInterface() {
        return new HelloWorldImpl();
    }
}
