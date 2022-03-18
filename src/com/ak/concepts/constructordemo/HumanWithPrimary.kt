package com.ak.concepts.constructordemo

class HumanWithPrimary(n : String) {
    var name: String = n

    fun think(){
        println("Kotlin is awesome.. $name")
    }
}