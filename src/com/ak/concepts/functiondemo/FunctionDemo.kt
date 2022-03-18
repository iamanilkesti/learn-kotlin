@file:JvmName("FunctionExample")   //use this name in java class for creating objects of FunctionDemo.kt file
package com.ak.concepts.functiondemo

fun main(args:Array<String>){
    addition(10, 30)

    var result = subtraction(30, 40)
    println("Subtraction of 30 and 40 is $result")

    var mRes = multiply(20, 40)
    println("Multiply of 20 and 40 is $mRes")

   var maxRes = maxOfTwo(9, 10)
    println("Max of 9 and 10 is $maxRes")
}

fun addition(a: Int, b:Int) {
    println(a+b)
}
fun subtraction(i: Int, j: Int):Int {
    return i-j;
}
fun multiply(x: Int, y: Int): Int = x*y;

fun maxOfTwo(a: Int, b: Int) : Int = if(a>b) a else b