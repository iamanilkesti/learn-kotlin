package com.ak.concepts.whendemo

fun main(args:Array<String>){

    var value:Int = 3
    when(value){
        1   -> println("One")
        2   -> println("Two")
        2   -> println("Three")
        else -> println("Give valid input")

    }

    //when as an expression
    var str = when(value){
        1   -> "One"
        2   -> "Two"
        2   -> "Three"
        else -> "Give valid input"
    }
    println("Input is : $str")
}