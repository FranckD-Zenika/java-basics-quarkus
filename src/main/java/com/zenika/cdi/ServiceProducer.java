package com.zenika.cdi;

import com.zenika.qualifiers.Choice;
import com.zenika.services.interfaces.ExampleService;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.inject.Instance;
import javax.enterprise.inject.Produces;
import javax.ws.rs.NotFoundException;

public class ServiceProducer {

    @ConfigProperty(name = "quarkus.example.serviceName", defaultValue = "default")
    String serviceName;

    @Produces
    @Choice
    public ExampleService exampleService(Instance<ExampleService> exampleServices) {
        return exampleServices.stream()
                .filter(exampleService -> exampleService.supported(serviceName))
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

}
