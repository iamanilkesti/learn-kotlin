package com.ak.concepts.extensionfunctions

fun main(args:Array<String>){

    var d1 = Developer()
    d1.skills = "Java"
    d1.showSkills()

    var d2 = Developer()
    d2.skills = "Kotlin"
    d2.showSkills()

    var d3 = d1.plus(d2)
    d3.showSkills()
}

//Extension functions , which are written outside the class but these will be part of class as regular functions
fun Developer.plus (d:Developer) : Developer {
    var dev = Developer()
    dev.skills = this.skills +", "+d.skills
    return dev
}