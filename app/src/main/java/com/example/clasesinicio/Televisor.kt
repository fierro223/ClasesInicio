package com.example.clasesinicio

class Televisor {
    var marca:String=""
    var disenio:String=""
    var tamanio:Int=0
    var encendido:Boolean=false

    constructor(marca:String,disenio:String,tamanio:Int,encendido:Boolean){
        this.marca=marca
        this.disenio=disenio
        this.tamanio=tamanio
        this.encendido=encendido
    }

    fun encendido(){
        this.encendido=true
        print("El televisor esta ensendido")
    }

    fun apagado(){
        this.encendido=false
        print("El televisor esta apagado")
    }

}