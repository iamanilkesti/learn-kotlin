package com.ak.concepts.inheritance


//By default all the classes in Kotlin are `final that means can't be extended
//to make a class to be extended by other classes
//we should use keyword 'open' with class as shown below
open class Human{
    open fun think(){
        println("Real think..")
    }
}
class Person{

}
//to extend a class , we should use class name with primary constructor as below
//multiple com.ak.concepts.inheritance is not supported, only one class can be inheroted
class Alien : Human()    //, Person()
{

}


fun main(args:Array<String>){
    var abhi = Human()
    abhi.think()

    var engineer = Alien()
    engineer.think()
}