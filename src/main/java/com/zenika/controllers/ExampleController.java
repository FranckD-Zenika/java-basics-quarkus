package com.zenika.controllers;

import com.zenika.qualifiers.Choice;
import com.zenika.services.interfaces.ExampleService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleController {

    private final ExampleService exampleService;

    @Inject
    ExampleController(@Choice ExampleService exampleService) {
        this.exampleService = exampleService;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return exampleService.hello();
    }
}