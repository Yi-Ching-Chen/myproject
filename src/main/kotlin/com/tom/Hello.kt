package com.tom

import javafx.scene.text.FontWeight

fun main(args: Array<String>) {
//    println("Hello kotlin"
//    Human().hello();
    val h = Human(66.5f,1.7f)
    h.hello()
    println(h.bmi())
    //--- val: const variable
//    var age = 19 // automated variable type, same as var age : Int = 19
//    age = 1
//    val b = 1
}
class  Human(var weight: Float, var height: Float) {
    fun bmi() :Float{
        val bmi = weight / (height * height);
        return bmi
    }

    fun hello() {
        println("hello kotlin")
    }
}
