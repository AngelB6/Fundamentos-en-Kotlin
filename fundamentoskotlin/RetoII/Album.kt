package com.AngelB6.fundamentoskotlin.RetoII

class Album {

}

fun main() {
//    Creamos todas las listas que utilizaremos para almacenar la informacion digitada por el usuario
    val Cancion = mutableListOf<String>()
    val Artista = mutableListOf<String>()
    val Lanzamiento = mutableListOf<String>()
    val Reproducciones = mutableListOf<Int>()
//    Le preguntamos la cantidad de canciones que tiene el album para saber cuantas veces se ejecutara el ciclo for y tambien el tipo de musica del album
    println("Ingrese la cantidad de canciones que tiene el album:\n")
    var cantCanciones: Int = readLine()!!.toInt()
    println("Ingrese el tipo de musica del album:\n")
    var tipoMusic: String = readLine().toString().lowercase()
    /* Creamos un ciclo for que se ejecute segun la cantidad de canciones digitadas por el usuario. Dentro se encuentran todas las presguntas necesaria sobre las caniones
    que se almacenaran en las listas creadas*/
    for (i in 1 .. cantCanciones) {
        println("Ingrese el titulo de la cancion N${i}:\n")
        var tituloCan: String = readLine().toString().lowercase()
        Cancion.add(tituloCan)
        println("Ingrese el nombre del artista para la cancion ${tituloCan}:\n")
        var nomArt: String = readLine().toString().lowercase()
        Artista.add(nomArt)
        println("Ingrese el año en que se publico ${tituloCan} (dd-mm-aaaa):\n")
        var añoPubli: String = readLine().toString().lowercase()
        Lanzamiento.add(añoPubli)
        println("Ingrese la cantidad de repoduciones (Sin . o ,):\n")
        var reproducciones: Int = readLine()!!.toInt()
        Reproducciones.add(reproducciones)
    }
    /* Creamos una variable posicion que alamcenara la posicion en la que se encuentra el numero maximo de reproducciones el cual fue encontrado con el metodo max(), luego esta
    posicion la usaremos para imprimir en pantalla el nombre de la cancion y con el metodo max() encontramos el numero mayor dentro de la lista de reproducciones y lo imprimimos en pantalla*/
    var posicion = Reproducciones.indexOf(Reproducciones.max())
    println("La cancion ${Cancion[posicion]} es la mas repoducida del album con ${Reproducciones.max()} reproducciones")
    println("---------------------------------------------------------------------------------------------------------------------")
    /* Creamos un ciclo for que recorra todas la posiciones de dos listas. La primera mostrara el nombre de la cancion y la segunda la cantidad de reproducciones. Con un condicional
    clsificara cada cancion entre popular o poco popular evaluando del numero de reproducciones*/
    for (i in Reproducciones.indices){
        if (Reproducciones[i]<1000){
            println("La cancion ${Cancion[i]} es poco popular porque tiene ${Reproducciones[i]} reproducciones")
        }else{
            println("La cancion ${Cancion[i]} es popular porque tiene ${Reproducciones[i]} reproducciones")
        }
    }
    println("---------------------------------------------------------------------------------------------------------------------")
//    Creamos una funcion que tendra un ciclo for en su interior el cual recorrera cada una de las posiciones de todos las listas y mostrara los valores que contiene cada uno
    fun mostrarCancion(){
        for (i in Cancion.indices){
            println("${Cancion[i]}, interpretada por ${Artista[i]}, se lanzo en ${Lanzamiento[i]} y tiene ${Reproducciones[i]} reproducciones\n")
        }
    }
//    Imprimimos por consola el metodo
    println(mostrarCancion())
}