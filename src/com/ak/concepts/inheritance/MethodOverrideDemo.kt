package com.ak.concepts.inheritance

open class Human2{
    //by default all the functions are final so we cant override them
    //to allow function override, we can use keyword 'open' with fun
    open fun think(){
        println("Real think..")
    }
}
class Alien2 : Human2()
{
    //to override any parent class method, we should specify "override" keyword
    override  fun think(){
        println("Virtual Thinking")
    }
}

fun main(args:Array<String>){
    var abhi = Human2()
    abhi.think()

    var engineer:Human2 = Alien2()
    engineer.think()
}