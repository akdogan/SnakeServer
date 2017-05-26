package com.snake.server.Response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HelloWorldResponse {
    private String name;
    private String message;

    public HelloWorldResponse(String name, String message) {
        this.name = name;
        this.message = message;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public String getMessage() {
        return message;
    }
}
