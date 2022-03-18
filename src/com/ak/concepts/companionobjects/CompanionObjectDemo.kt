package com.ak.concepts.companionobjects

//Kotlin doesnt have static feature by default, to support static,
// we have to use companion object keyword along with @jvmStatic annotation as shown below

class A {
    companion object{
        @JvmStatic
        fun show(){
            println("In A's Show")
        }
    }
}
 fun main(args:Array<String>){
     A.show()
 }