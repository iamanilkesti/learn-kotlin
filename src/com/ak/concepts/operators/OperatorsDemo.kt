package com.ak.concepts.operators

import com.ak.concepts.objconcept.Alien

fun main(args: Array<String>){

    var num1:Int=4
    var num2:Int=10;
    var sum = num1+num2;
   //println("SUM: "+sum)
    println("Addition of $num1 and $num2 is $sum")

    var anil=Alien();
    anil.name="Anil Kesti"
    println("Alien Name is: ${anil.name}")
}