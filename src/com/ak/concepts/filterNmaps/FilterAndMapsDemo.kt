package com.ak.concepts.filterNmaps

fun main(args:Array<String>){
    var values = listOf<Int>(10,13,14,18, 19, 21)
    //values.forEach(::println)

    //filter even numbers
    var evens = values.filter { it -> it%2==0 }
    println("---:Filtered evens: ---")
    evens.forEach(::println)     // using filter we can apply any condition on elements
    println("---:Doubled evens:---")
    var doubles = evens.map { it*2 } // using map we can transform elements to any condition
    doubles.forEach(::println)

    var results = values
                        .filter { it -> it% 2 ==0}
                        .map { it*2 }
}