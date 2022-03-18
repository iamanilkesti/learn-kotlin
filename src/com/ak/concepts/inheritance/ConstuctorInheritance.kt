package com.ak.concepts.inheritance
//init blocks are for primary constructors
open class Human3(age:Int){
    init {
        println("In human..$age")
    }
    open fun think(){
        println("Real think..")
    }
}
//the subclass constructor invokes the super class constructor first,
// before invoking its own cnstructor, same as java
class Alien3(alienAge:Int) : Human3(alienAge)
{
    init {
        println("In Alien..")
    }
    override  fun think(){
        println("Virtual Thinking")
    }
}

fun main(args:Array<String>){
    var engineer = Alien3(30)
}