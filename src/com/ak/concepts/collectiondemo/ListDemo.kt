package com.ak.concepts.collectiondemo

data class Developer(var skill:String)

fun main(args:Array<String>){

    // by default listOf() return the readonly list,
    // we cant modified the returned list
    var values = listOf<Int>(10,30,50,70)
    for(i in values)
        print(" "+i)
    //println("\n"+values.get(3))//get element on index 3
    println()
    var nums = mutableListOf<Int>(1,2,3,4,5) // we get mutable list here, we can add or remove elements
    nums.add(20)
    for(i in nums)
        print(" "+i)
    println()
    nums.add(90)
    for(i in nums)
        print(" "+i)
    println()
    nums.add(44)
    for(i in nums)
        print(" "+i)

    //List of custom objects
    var developers:List<Developer> = listOf<Developer>(Developer("Java"), Developer("Kotlin"), Developer("SQL"))
    println()
    for(i in developers)
        //println(i.skill)
        println(i)
}