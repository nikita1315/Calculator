package com.cko.sampleSpringProject.controller.rest;

import com.cko.sampleSpringProject.model.CalculationRequest;
import com.cko.sampleSpringProject.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorRestController {

    @Autowired
    Calculator calculator;

    @GetMapping("/count")
    public double getResult(CalculationRequest calculationRequest) {




        return calculator.count(calculationRequest.getNumbers(),calculationRequest.getAction());
    }

}
