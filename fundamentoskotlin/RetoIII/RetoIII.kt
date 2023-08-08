package com.AngelB6.fundamentoskotlin.RetoIII

class RetoIII {

}

fun main() {
//    Creamos dos listas las cuales almacenaran el nombre de cada uno de los articulos y el precio base de cada uno de ellos. Luego le damos la bienvenida al usuario.
    val articulos = mutableListOf<String>("Jarron Chino", "Mesa Del Renacimiento", "Pintura Picasso", "Autoretratro Miguel Angel")
    val precioBase = mutableListOf<Int>(10000, 1000, 3000, 5000)
    println("Bienvenido a la subasta del año!\nEn esta ocasion se estaran ofreciendo 4 articulos de suma importancia para la historia")
    /* Creamos un ciclo for que se ejecutara de acuerdo con la cantidad de articulos existentes. Dentro le mostraremos por cada ciclo del for un articulo de las lista y el precio que
    tiene este. Preguntaremos si existe alguna oferta, si la respuesta es no el articulo se quedara en casa por precio base. Si la respuesta es si se creera una lista que alamcenera
    temporalmente el valor ofreciso por cada uno de los articulos. Tambien se crea un ciclo While que le preguntara al usuario cuanto ofrece por el articulo, este valor se agregara
    a la lista anteriormente mencionada y luego le preguntara que si existe algun otra oferta. Si es asi el ciclo While se vuelve a ejecutar. Cuando la respuesta sea diferente a si
    se ejecutara una condicional que evaluara el valor maximo de la lista de precios ofrecidos con el metodo max(). Si el valor maximo es superior al precio base del articulo se le
    mostara al usuario un mensaje diciendo que articulo y porque valor fue vendido. Si el valor es menor al precio base se le mostrara un mensaje diciendo que el articulo se quedo en
    casa. Luego limpiamos la lista que almacena los precio ofrecidos para almacenar los nuevos valores al nuevo articuo.*/
    for (i in 0 .. 3){
        println("El articulo N${i+1} es: ${articulos[i]}\nEste tiene un valor base de: $${precioBase[i]}\nQue empiece la subasta!\n¿Hay alguna oferta?\n")
        var resp:String = readLine().toString().lowercase()
        if (resp=="no"){
            println("El articulo ${articulos[i]} se queda en casa por un valor de $${precioBase[i]}!")
            println("---------------------------------------------------------------------------------------------------------------------")
        }else if (resp=="si"){
            val preciosOfertados = mutableListOf<Int>()
            while (resp == "si") {
                println("Ingrese la cantidad de dinero que ofrece por el articulo ${articulos[i]}:\n")
                var precio: Int = readLine()!!.toInt()
                preciosOfertados.add(precio)
                println("¿Aguna otra oferta?")
                resp = readLine().toString().lowercase()
            }
            if (preciosOfertados.max()<precioBase[i]) {
                println("El articulo ${articulos[i]} se queda en casa por un valor de $${precioBase[i]}!")
                println("---------------------------------------------------------------------------------------------------------------------")
            } else if (preciosOfertados.max()>precioBase[i]) {
                println("El articulo ${articulos[i]} fue vendido por $${preciosOfertados.max()}")
                println("---------------------------------------------------------------------------------------------------------------------")
            }
            preciosOfertados.clear()
        }else{
            println("Ingrese una respuesta correcta (si - no)")
        }
    }
//    Mostramos un mensaje agradeciendo por la participacion
    println("Gracias por esta increible subasta!")
}