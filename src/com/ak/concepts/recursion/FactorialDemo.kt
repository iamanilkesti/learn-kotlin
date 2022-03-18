package com.ak.concepts.recursion

import java.math.BigInteger

fun main(args: Array<String>)
{
    var num:Int = 6
    //1. Tradtional way
    var res:Int =1
    for (i in 1..6){
        res=res*i
    }
    println("Factorial of $num is $res")

    var factorial = fact(10)
    println("Factorial of 10 is $factorial")

    var bigNum = BigInteger("600")
    var bigFact = fact(bigNum)
    println("Factorial of $bigNum is $bigFact")
}
//2.recusrsion_function for normal int
fun fact(num:Int): Int
{
    if(num == 0)
        return 1
    else
        return num* fact(num-1)
}
//2.recusrsion_function for normal Big Integer numbers
fun fact(num:BigInteger): BigInteger
{
    if(num == BigInteger.ZERO)
        return BigInteger.ONE
    else
        return num* fact(num-BigInteger.ONE)
}