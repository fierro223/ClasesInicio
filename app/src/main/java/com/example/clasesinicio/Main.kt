package com.example.myapplication

fun main(){
    var auto1= Veiculo("For","Falcon",99,"AZC156",true)


    print("El veiculo del año ${auto1.anio}, con patente ${auto1.patente}, " +
            "de la marca ${auto1.marca}, del modelo ${auto1.modelo}, " +
            "y se encendio ${auto1.encendido} ")
}

