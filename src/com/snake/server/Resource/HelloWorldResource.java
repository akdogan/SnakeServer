package com.snake.server.Resource;

import com.snake.server.Response.HelloWorldResponse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class HelloWorldResource {

    @GET
    public HelloWorldResponse get(@QueryParam("name") String name) {
        return new HelloWorldResponse(name, "Hello " + name);
    }
}
