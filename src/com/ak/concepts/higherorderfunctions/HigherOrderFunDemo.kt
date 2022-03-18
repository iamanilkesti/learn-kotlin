package com.ak.concepts.higherorderfunctions

data class Developer(var skill:String, var rating:Int)
fun main(args:Array<String>){
    var values = listOf<Int>(10,30,50,70)
    //for(i in values)   //external for loop, not part of list
    //    print(" "+i)

    //foreach is a function, and we are passing a functio to a function
    values.forEach({ println(it) })
    println("--")
    values.forEach(::println)

}