package com.ak.concepts.constructordemo

class HumanWithSecondary(n:String) {

    var name:String = n
    var age:Int = 0

    constructor(age:Int, name:String) : this(name){
    this.age=age
    }
    fun think(){
        println("Kotlin is awesome.. $name , age is $age")
    }
}
