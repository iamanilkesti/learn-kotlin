import com.ak.concepts.javacode.JavaAlien
import com.ak.concepts.objconcept.Alien

fun main(args : Array<String>){
   // print("Anil, welcome to Kotlin world!!!")
     var alien = Alien();
    alien.name = "ANIL";
    println("Alien name is:" + alien.name)
    println("Alien name is: ${alien.name}")

    var jAlien= JavaAlien();
    jAlien.name="Java Alien"

    println("Java Alien name is: ${jAlien.name}")
}