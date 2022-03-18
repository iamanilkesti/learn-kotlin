package com.ak.concepts.collections

fun main(args:Array<String>){

    var list = listOf(10, 20, 30, 40, 50)
    for(e in list){
        println(e)
    }
    println("Index : Element")
    for((index, element) in list.withIndex()){
        println("$index : $element")
    }
}