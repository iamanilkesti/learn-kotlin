package com.ak.concepts.collections

import java.util.*

fun main(args:Array<String>){

    var persons = TreeMap<String, Int>()
    persons["Anil"] = 456
    persons["anu"] = 143

    for((key, value) in persons){
        println("$key  -> $value")
    }
}