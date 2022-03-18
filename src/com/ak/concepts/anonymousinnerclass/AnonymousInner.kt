package com.ak.concepts.anonymousinnerclass

interface Mobile{
    fun ring()
}

interface Car{
    fun drive()
}
fun main(args:Array<String>){

    var mobile : Mobile = object : Mobile{
        override fun ring() {
            println("Mobile is ringing...")
        }
    }
    mobile.ring()

    var car : Car = object : Car{
        override fun drive() {
            println("Car is moving...")
        }
    }
    car.drive()
}