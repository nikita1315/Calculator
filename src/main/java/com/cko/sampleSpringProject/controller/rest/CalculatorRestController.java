package com.cko.sampleSpringProject.controller.rest;

import com.cko.sampleSpringProject.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorRestController {

    @Autowired
    Calculator calculator;

}
