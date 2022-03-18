package com.ak.concepts.javacode;

import com.ak.concepts.functiondemo.DefaultParamsAndNamedParamKt;
import com.ak.concepts.functiondemo.FunctionExample;

public class Runner {

    public static void main(String[] args) {
        //Class name of any kotlin fun main is Kotlin file name appended with Kt As java class
        //ex. Demo.kt file would be DemoKt.class in java by default

        // we can change the file of kt to be some custum java class name using annotaion @file:jvmName("customName")
       int res= FunctionExample.maxOfTwo(20, 43);
       System.out.print(res);

       // By default we cant have overloaded methods of calcAmount function of file DefaultParamsAndNamedParamKt
        // so from jabva we should pass both params
        int totalAmount = DefaultParamsAndNamedParamKt.calcAmount(300, 0.06);

        //to achive default params concept and use overloaded methods
        // we should use @JvmOverloads over the calcAmount method in kotlin class
        int totalAmount2 = DefaultParamsAndNamedParamKt.calcAmount(400);



    }
}
