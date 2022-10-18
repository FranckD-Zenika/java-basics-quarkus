package com.zenika.services;

import com.zenika.services.interfaces.ExampleService;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DefaultExampleService implements ExampleService {
    @Override
    public String hello() {
        return "Hello from Reactive";
    }

    @Override
    public boolean supported(String serviceName) {
        return serviceName.equalsIgnoreCase("default");
    }
}
