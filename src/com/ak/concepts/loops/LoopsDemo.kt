package com.ak.concepts.loops

fun main(args:Array<String>){
    var  nums: IntRange = 0..10
    for( a in nums step 2){
      //  print(" $a")
    }
    println()
    // downTo reverse order numbs
    var  revNums  = 10 downTo 1
    var  revNums1  = 10.downTo(1)
    for( b in revNums1 ){
        print(" $b")
    }
    println()
    // until
    var  numUntil  = 1 until 16
    for( b in numUntil.reversed() ){
        print(" $b")
    }
    println()
    var  numUntilReversed  = 1 until 16
    for( b in numUntilReversed.reversed() ){
        print(" $b")
    }
    println()
    var chRange = 'a'..'z';
    for( b in chRange ){
        print(" $b")
    }
}
