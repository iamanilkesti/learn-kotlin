package com.ak.concepts.functiondemo

fun main(args:Array<String>){

    var totalAmtWithDefaultInterest = calcAmount(250)
    println("Total amount to be paid with default amount is: $totalAmtWithDefaultInterest")

    var totalAmtWithCustomInterest = calcAmount(250, 0.04)
    println("Total amount to be paid with default amount is: $totalAmtWithCustomInterest")

    //Named params
    var namedParm = calcAmount(principal = 500, interest = 0.09)
    println("1. Total amount to be paid with interest = 0.09,  amount is: $namedParm")

    var namedParm2 = calcAmount( interest = 0.09, principal = 500)
    println("2. Total amount to be paid with interest = 0.09,  amount is: $namedParm2")
}
@JvmOverloads
fun calcAmount(principal: Int, interest: Double = 0.05 ): Int {
return (principal+principal*interest).toInt();
}
