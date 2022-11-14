package com.luv2code.springdemo.mvc;

import javax.validation.constraints.*;

public class Client {

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String name;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String disponibility;

    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String problem;

    @Min(value = 0, message = "must be greater than or equal to zero")
    @Max(value = 40, message = "must be less than or equal to 40")
    private int txValue;

    @NotNull(message = "is required")
    @Pattern(regexp = "^[0-9]{2}-[0-9]{9}$", message = "format must be ddd-9digits ex: 48-123456789")
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getTxValue() {
        return txValue;
    }

    public void setTxValue(int txValue) {
        this.txValue = txValue;
    }

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
