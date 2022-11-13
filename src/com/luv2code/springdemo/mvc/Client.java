package com.luv2code.springdemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Client {
    @NotNull(message = "is required")
    @Size(min=1, message="is required")
    private String name;
    @NotNull(message = "is required")
    @Size(min=1, message="is required")
    private String disponibility;
    @NotNull(message = "is required")
    @Size(min=1, message="is required")
    private String problem;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisponibility() {
        return disponibility;
    }

    public void setDisponibility(String disponibility) {
        this.disponibility = disponibility;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
}
