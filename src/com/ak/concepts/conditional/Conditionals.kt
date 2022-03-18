package com.ak.concepts.conditional

fun main(args:Array<String>){
    var num1:Int=4
    var num2:Int=10
    var result:String="";
    result= if(num1>num2){
        "num1 is greater than num2"
    }else{
        "num2 is greater than num1"
    }
    //println("Result is : $result")

    // String comparison
    var str1:String= "Anil"
    var str2:String="Anil"
    if(str1.equals(str2)){
        println("Same")
    }else{
        println("Not same")
    }

    if(str1 ==  str2){
        println("Same")
    }else{
        println("Not same")
    }
}