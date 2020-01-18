package com.cko.sampleSpringProject.service;

//import org.graalvm.compiler.serviceprovider.ServiceProvider;
import org.springframework.stereotype.Service;

import static java.lang.Math.pow;

@Service
public class Calculator {



    public double count(float[] numbers, String action) {

        double a = 0;


           if(numbers.length==1) {
               switch (action) {
               case "plus":
                   a = numbers[0] + numbers[1];
                   break;
               case "minus":
                   a = numbers[0] - numbers[1];
                   break;
               case "increase":
                   a = numbers[0] * numbers[1];
                   break;
               case "decrease":
                   a = numbers[0] / numbers[1];
                   break;
               case "exponent":
                   a = pow(numbers[0], numbers[1]);
                   break;
               case "radical":
                   a = pow(numbers[0], 1 / numbers[1]);
           }

        }else{
               return -0.123456789;
           }

        return a;
    }


}
