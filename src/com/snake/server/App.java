package com.snake.server;

import com.snake.server.Resource.HelloWorldResource;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Environment;

public class App extends Application<Configuration> {
    public void run(Configuration configuration, Environment environment) throws Exception {
        HelloWorldResource resource = new HelloWorldResource();
        environment.jersey().register(resource);
    }
}
