package com.ak.concepts.nullhandling

import com.ak.concepts.objconcept.Alien

fun main(args:Array<String>){

    // Kotlin doesnt allow null assignment
    // var str:String=null;

    // Incase we want null value assignment then we should append ? to Type as shown in example
    var str : String? = null

    var alien = Alien();
    alien.name=null;
    println(alien.name?.length)

    //nullable Alien object var
    var nAlien : Alien? = Alien()
    nAlien = null
    println(alien?.name)

}