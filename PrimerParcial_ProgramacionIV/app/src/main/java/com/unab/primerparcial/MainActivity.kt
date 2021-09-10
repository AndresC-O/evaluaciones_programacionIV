package com.unab.primerparcial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ejercicio01()
        ejercicio02()
        ejercicio03()
    }
}

private fun ejercicio01(){

    var color = "Celeste"

    if (color == "Azul"){
        println("> El color de la variable es: $color")
    }
    else if(color == "Verde"){
        println("> El color de la variable es: $color")
    }
    else if(color == "Amarillo"){
        println("> El color de la variable es: $color")
    }
    else if(color == "Rojo"){
        println("> El color de la variable es: $color")
    }
    else if(color == "Marron"){
        println("> El color de la variable es: $color")
    }
    else if(color == "Violeta"){
        println("> El color de la variable es: $color")
    }
    else if(color == "Rosado"){
        println("> El color de la variable es: $color")
    }
    else{
        println("> El color de la variable no ha sido identificado")
    }
}

private fun ejercicio02(){

    val tipodecomida = "Pan Frances"

    when(tipodecomida){
        "Pupusas" ->{
            println("> Pais de origen: El Salvador")
        }
        "Tacos" ->{
            println("> Pais de origen: Mexico")
        }
        "Baleadas" ->{
            println("> Pais de origen: Honduras")
        }
        "Pan Frances" ->{
            println("> Pais de origen: Francia")
        }
        "Tortillas de papas" ->{
            println("> Pais de origen: Espania")
        }
        "Sushi" ->{
            println("> Pais de origen: Japon")
        }
        "Rollitos primavera" ->{
            println("> Pais de origen: China")
        }
        //------------When con agrupacion---------------------------
        "Atol de Elote", "Frijoles", "Horchata" ->{
            println("> Pais de origen: El Salvador (Agrupacion)")
        }
        "Carne Asada", "Chuleta Fria", "Chorizos en barbacoa" ->{
            println("> Pais de origen: Honduras (Agrupacion)")
        }
        "Gazpacho", "Paella", "Churros" ->{
            println("> Pais de origen: Espania (Agrupacion)")
        }
        "Apple Pie", "Ruben Sandwich", "Mac and cheesse" ->{
            println("> Pais de origen: Estados Unidos (Agrupacion)")
        }
        "Pelmeni", "Shashlyk", "Borsch" ->{
            println("> Pais de origen: Rusia (Agrupacion)")
        }
        else ->{
            println("> Pais de origen: DESCONOCIDO")
        }
    }
}

private fun ejercicio03(){

    println("-----------#1-------------")
    //Imprimir valores X de (1 en 1)
    for (x in 0..10){
        println(x)
    }
    println("-----------#2-------------")
    //Imprimir valores X de (2 en 2)
    for (x in 10..20 step 2){
        println(x)
    }
    println("-----------#3-------------")
    //Imprimir valores X de (1 en 1 hacia abajo)
    for (x in 15 downTo 0){
        println(x)
    }
    println("-----------#4-------------")
    //Imprimir valores X de (3 en 3 hacia abajo)
    for (x in 30 downTo 0 step 3){
        println(x)
    }
}