package com.example.starbucks.status;

public enum ResultStatus {
    SUCCESS("Success"),
    FAIL("FAIL");

    private String result;

    ResultStatus(String description){this.result=description;}

    public String getResult() {return result;}
}
