package com.ak.concepts.collectiondemo

fun main(args:Array<String>){
    //fixed length array, with initial elements
    var ar = intArrayOf(10,20,30,40,50)
    println("4th element is : ${ar.get(3)}")
    ar.set(2, 60)
    for(i in ar)
        print(" "+i)
    println("Last element is : ${ar.last()}")

    //
    var nums = IntArray(5)
    nums.set(0,2)
    nums.set(1,4)
    nums.set(2,6)
    nums.set(3, 8)
    nums.set(4, 10)
    for(n in nums)
        print(" "+n)
    println()
    var strAr = arrayOfNulls<String>(5)
    strAr[0]= "anil"
    strAr[1]= "abhi"
    strAr[2]= "anu"
    strAr[3]= "saru"
    strAr[4]= "suru"
    for(s in strAr)
        print(" "+s)

    var doubleAr = DoubleArray(3)
    var floatAr = FloatArray(3)
}