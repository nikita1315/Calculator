package com.cko.sampleSpringProject.model;

public class CalculationRequest {

    private String action;

    private  float[] numbers;


    public CalculationRequest(String action, float[] numbers) {
        this.action = action;
        this.numbers = numbers;
    }


    public void setAction(String action) {
        this.action = action;
    }

    public void setNumbers(float[] numbers) {
        this.numbers = numbers;
    }


    public String getAction() {
        return action;
    }

    public float[] getNumbers() {
        return numbers;
    }
}
