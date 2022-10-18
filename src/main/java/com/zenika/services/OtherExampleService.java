package com.zenika.services;

import com.zenika.services.interfaces.ExampleService;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OtherExampleService implements ExampleService {

    @Override
    public String hello() {
        return "hello Bodo";
    }

    @Override
    public boolean supported(String serviceName) {
        return serviceName.equalsIgnoreCase("other");
    }
}
