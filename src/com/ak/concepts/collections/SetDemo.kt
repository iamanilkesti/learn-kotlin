package com.ak.concepts.collections

import kotlin.collections.HashSet

fun main(args:Array<String>){
    var persons = HashSet<String>()
    persons.add("Anil")
    persons.add("Ajay")
    persons.add("Anu")
    persons.add("Anil")
    persons.add("Abhi")
    persons.forEach(::println)

    var filt = persons.filter {  !it.equals("Abhi") }
    filt.forEach(::println)
}
