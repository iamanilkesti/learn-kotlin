package com.ak.concepts.dataclassdemo

//1. every class needs toString() method
//2. equals and hashcode mathods to check the equality of the objects
//3. cloning the objects
// these all can be available with only one keyword with class .. i.e. "data"
//data class have by default clone, toString, equals , hashcode methods

data class Laptop(val brand:String, val price:Int){
    fun show(){
        println("Its an awesome machine!!!")
    }
}
fun main(args:Array<String>){

    var lap1 = Laptop("Macbook Air", 5000)
    var lap2 = Laptop("Macbook Pro", 5500)

    println("lap1: "+lap1)
    println("lap2: "+lap2)
    var lap3 = lap1.copy();
    println("Are lap1 and lap2 same? : " + lap1.equals(lap2))
    println("lap3: "+lap3)
    println("Are lap1 and lap3 same? : " + lap1.equals(lap3))



}