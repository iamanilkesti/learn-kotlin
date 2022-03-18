package com.ak.concepts.objectkeyword

data class Book(var name:String, var price:Int){

}
object BookShelf {
    var books = arrayListOf<Book>()

    fun showBooks(){
        println("Available books are: ")
        for(b in books){
            println(b)
        }
    }

}
fun main(args:Array<String>){
    BookShelf.books.add(Book("Java", 300))
    BookShelf.books.add(Book("Kotlin", 200))
    BookShelf.books.add(Book("SQL", 150))

    BookShelf.showBooks()

}