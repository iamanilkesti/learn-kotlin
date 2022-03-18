package com.ak.concepts.UserInputDemo

fun main(args:Array<String>){

    //java way of reading user input
    /*var sc = Scanner(System.`in`)
    var input :Int = sc.nextInt();
    println("Input is: $input")*/

    //kotlin way of reading input
    var inputK = readLine();
    println("Kotlin way input: $inputK")
}