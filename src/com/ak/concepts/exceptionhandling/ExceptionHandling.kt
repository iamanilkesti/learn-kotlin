package com.ak.concepts.exceptionhandling

import java.lang.NumberFormatException

fun main(args:Array<String>){

    var str:String = "2A"
    var num:Int = 0;

    try {
        num = str.toInt()
    }catch (e : NumberFormatException){
        println("Give proper input!")
    }
    finally {
        println("Finally block!")
    }
    num++;
    println(num)

    //try-catch can be used as expression

    var num1:Int = try {
        str.toInt()
    }catch (e : NumberFormatException){
        -1
    }
    finally {
        println("Finally block!")
    }
    num1++;
    println("try-catch expression result: $num1")
}