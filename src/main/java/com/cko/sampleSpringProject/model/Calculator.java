package com.cko.sampleSpringProject.model;

import javax.persistence.*;

import static java.lang.Math.pow;


@Entity
public class Calculator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

public double count (float[] numbers, String action){

    double a =0;

    switch (action){
        case "plus":
            a=numbers[0]+numbers[1];
            break;
        case "minus":
            a=numbers[0]-numbers[1];
            break;
        case"increase":
            a=numbers[0]*numbers[1];
            break;
        case "decrease":
            a=numbers[0]/numbers[1];
            break;
        case"exponent":
            a=pow(numbers[0],numbers[1]);
            break;
        case "radical":
            a=pow(numbers[0],1/numbers[1]);


    }

    return a;
}


}
