package com.ak.concepts.interfacedemo

interface A{
    fun show()
    fun abc(){
        println("in abc A")
    }
}
interface B{
    fun display()
    fun abc(){
        println("in abc B")
    }
}
class C : A, B{
    override fun show() {
        println("in show!")
    }

    override fun display() {
        println("in display!")
    }

    override fun abc(){
        //println("in abc C")
        super<A>.abc() // for getting impl of parent interface A
        //super<B>.abc() // for getting impl of parent interface B
    }

}
fun main(args:Array<String>){
    var c = C()
    c.show()
    c.display()
    c.abc()
}