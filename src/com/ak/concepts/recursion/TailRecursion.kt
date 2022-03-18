package com.ak.concepts.recursion

import java.math.BigInteger

fun main(args:Array<String>){

    var num = BigInteger("5000")
    var res = fact(num, BigInteger.ONE)
    println("Factorial of $num is $res")
}
fun fact(num:BigInteger, result:BigInteger):BigInteger
{
    if(num == BigInteger.ZERO)
        return result
    else
        return fact(num-BigInteger.ONE, num*result)
}