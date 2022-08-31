package com.example.clasesinicio

fun main(){
    var tv1=Televisor("TOPHOUSE", "Comun",14,true)

    print("El televisor de la marca ${tv1.marca} del diseño ${tv1.disenio}, " +
            "esta ensendido ${tv1.encendido}.")
    tv1.encendido()
    tv1.apagado()
}