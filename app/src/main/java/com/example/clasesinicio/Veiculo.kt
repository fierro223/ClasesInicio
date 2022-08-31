package com.example.myapplication

class Veiculo {
    var marca:String=""
    var modelo:String=""
    var anio:Int=0
    var patente:String=""
    var encendido:Boolean=false

    constructor(marca:String,modelo:String,anio:Int,patente:String,encendido:Boolean){
        this.marca=marca
        this.modelo=modelo
        this.anio=anio
        this.patente=patente
        this.encendido=encendido
    }
    fun encendido() {
        this.encendido=true
        print("El Veiculo esta Encendido")
    }
    fun apagar(){
        this.encendido=false
        print("El Veiculo esta Apagado")
    }

}
