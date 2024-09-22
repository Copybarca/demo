package com.example.demo.calculating;

import static java.lang.Math.round;

public class CalcVocationPay {
    public static double count(int salary,int day){
        double result;
        try{
            result = (double)salary/12/29.3*day;
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            result = 0;
        }


        return round(result);
    }
}
