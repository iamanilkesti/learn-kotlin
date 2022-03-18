package com.ak.concepts.abstractclassdemo

abstract class Human4{
    abstract fun think()
    fun talk(){
        println("Talking")
    }
}
class Engineer : Human4()
{
    override  fun think(){
        println("Virtual Thinking")
    }
}
class Doctors : Human4(){
    override fun think(){
        println("Thinking of prescriptions..")
    }
}
fun main(args:Array<String>){

    var engineer = Engineer()
    engineer.talk()
    engineer.think()

    var doc = Doctors()
    doc.talk()
    doc.think()
}