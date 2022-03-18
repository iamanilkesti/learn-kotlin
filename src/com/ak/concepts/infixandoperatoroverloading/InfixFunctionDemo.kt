package com.ak.concepts.infixandoperatoroverloading

import com.ak.concepts.extensionfunctions.Developer

fun main(args:Array<String>){

    var d1 = Developer()
    d1.skills = "Java"
    d1.showSkills()

    var d2 = Developer()
    d2.skills = "Kotlin"
    d2.showSkills()

    var d3 = d1 plus d2  // we can call infix functions without having dot as show in left side
    d3.showSkills()
}

//Infix functions: , which are invoked as a plain english text as shown above,
// We should use infix as prefix with fun key word to define a function as infix function
// Infix function works when we have single input param

infix fun Developer.plus (d:Developer) : Developer {
    var dev = Developer()
    dev.skills = this.skills +", "+d.skills
    return dev
}