package com.ak.concepts.constructordemo

fun main(args:Array<String>){

    var humanWithPrimary = HumanWithPrimary("Anil")
    humanWithPrimary.think()

    var human2 = HumanWithSecondary(30, "Anil Kesti")
    human2.think()
}