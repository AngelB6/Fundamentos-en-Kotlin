package com.AngelB6.fundamentoskotlin.RetoI

class RetoI {

}

fun main() {
//    Creamos las listas que almacenaran los telefonos ingresados por el usuario, la cantidad de notificaciones y los posibles mensajes que se le mostraran
    val telefonos = mutableListOf<String>()
    val notificaciones = mutableListOf<Int>()
    val Mensajes = mutableListOf<String>("Usted recibio ", "Usted recibio +99 notificaciones", "No hay mensajes disponibles")
//    Creamos un ciclo Do-While que permitira registrar y almacenar el telefono y la cantidad de notificicaiones del telefono
    do {
        println("Ingrese su numero de telefono:\n")
        var telefono:String= readLine().toString()
        telefonos.add(telefono)
        println("Por favor ingrese la cantidad de notificaciones recibidas al telefono ${telefono}:\n")
        var noti: Int = readLine()!!.toInt()
        notificaciones.add(noti)
//        Creamos una condicional con los limites establecidos en el PDF y mostramos uno de los mensajes alamcenados dependiendo de la cantidad de notificaciones
        if (noti > 0 && noti <= 100) {
            println(Mensajes[0] + "${noti} notificaciones")
        } else if (noti > 100) {
            println(Mensajes[1])
        } else {
            println(Mensajes[2])
        }
//        Preguntamos si desea registrar otro telefono
        println("¿Desea registrar otro telefono?")
        var resp:String= readLine().toString().lowercase()
    } while(resp=="si")
//    Mostramos los telefonos registrados y la cantidad de notificaciones de cada uno de ellos
    println("Los telefonos registrados son: ${telefonos}")
    println("La cantidad de notificaiones por cada telefono es: ${notificaciones}")
}