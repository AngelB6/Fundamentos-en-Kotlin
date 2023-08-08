package com.AngelB6.fundamentoskotlin.RetoIV

class RetoIV {
}

fun main() {
//    Creamos todas las listas para cada una de las categorias las cuales almacenaran los nombres, descripciones y precios de cada plato
    val nomEntrada = mutableListOf<String>()
    val descEnt = mutableListOf<String>()
    val precEnt = mutableListOf<Int>()
//  ------------------------------------------
    val nomPlatoFue = mutableListOf<String>()
    val descPlatoFue = mutableListOf<String>()
    val precPlatoFue = mutableListOf<Int>()
//  ------------------------------------------
    val nomPost = mutableListOf<String>()
    val descPost= mutableListOf<String>()
    val precPost = mutableListOf<Int>()
//  -------------------------------------------
    val nomBeb = mutableListOf<String>()
    val descBeb = mutableListOf<String>()
    val precBeb = mutableListOf<Int>()
//  --------------------------------------------
//    Le damos la bienvenida al usuario y le preduntamos que si desea acceder al menu principal
    println("Bienvenido!\n¿Desea ir al menu principal?:\n")
    var resp1:String = readLine().toString().lowercase()
    while (resp1=="si") {
//Mostramos el menu principal con las distintas acciones que permite realizar el sistema. El usuario digita una de las opciones y con un condicional When ejecutamos la opcion escogida.
        println("¿Que accion desea realizar?\n1. Agregar Platos\n2. Consultar Platos\n3. Consultar Plato Por Codigo\n4. Modificar Un Plato\n5. Eliminar Un Plato")
        var resp:Int = readLine()!!.toInt()
//        Dependiendo la opcion seleccionada se ejecutara un bloque de codigo para cada una.
        when (resp) {
//            La primera opcion es registrar un plato nuevo. Dentro de esta se le pedira que digite a que categoria pertenece el plato que va a registrar
            1 -> {
                println("Usted selecciono la opcion agregar plato\n¿A que categoria desea agregar el plato?\n1. Entradas\n2. Platos Fuertes\n3. Postres\n4. Bebidas")
                var pla: Int = readLine()!!.toInt()
//                Dependiendo de la categoria se le preguntara el nombre, la descipcion y precio del plato. Todo esto se alamacenara en las listas a la que pertenece el plato.
                when (pla) {
                    1 -> {
                        println("Usted selecciono Entradas\nPor favor ingrese el nombre del plato:\n")
                        var nomPla: String = readLine().toString().lowercase()
                        nomEntrada.add(nomPla)
                        println("Por favor ingrese la descripcion del plato:\n")
                        var desc: String = readLine().toString().lowercase()
                        descEnt.add(desc)
                        println("Por favor ingrese el precio del plato:\n")
                        var prec: Int = readLine()!!.toInt()
                        precEnt.add(prec)
                    }
                    2 -> {
                        println("Usted selecciono Platos Fuertes\nPor favor ingrese el nombre del plato:\n")
                        var nomPla: String = readLine().toString().lowercase()
                        nomPlatoFue.add(nomPla)
                        println("Por favor ingrese la descripcion del plato:\n")
                        var desc: String = readLine().toString().lowercase()
                        descPlatoFue.add(desc)
                        println("Por favor ingrese el precio del plato:\n")
                        var prec: Int = readLine()!!.toInt()
                        precPlatoFue.add(prec)
                    }
                    3 -> {
                        println("Usted selecciono Postres\nPor favor ingrese el nombre del postre:\n")
                        var nomPla: String = readLine().toString().lowercase()
                        nomPost.add(nomPla)
                        println("Por favor ingrese la descripcion del postre:\n")
                        var desc: String = readLine().toString().lowercase()
                        descPost.add(desc)
                        println("Por favor ingrese el precio del postre:\n")
                        var prec: Int = readLine()!!.toInt()
                        precPost.add(prec)
                    }
                    4 -> {
                        println("Usted selecciono Bebidas\nPor favor ingrese el nombre de la bebida:\n")
                        var nomPla: String = readLine().toString().lowercase()
                        nomBeb.add(nomPla)
                        println("Por favor ingrese la descripcion de la bebida:\n")
                        var desc: String = readLine().toString().lowercase()
                        descBeb.add(desc)
                        println("Por favor ingrese el precio de la bebida:\n")
                        var prec: Int = readLine()!!.toInt()
                        precBeb.add(prec)
                    }
                }
            }
//            La segunda opcion es la que permite consultar los platos resgistrados dependiendo de la categoria seleccionada por el usuario.
            2 ->{
                /* Se le pregunta al usuario la categoria que desea consultar y con la condicional When se ejecuta un ciclo for dependiendo de la categoria seleccionada
                que recorrera toda la lista mostrando cada uno de los platos*/
                println("Usted selecciono la opcion consultar platos\n¿A que categoria desea consultar?\n1. Entradas\n2. Platos Fuertes\n3. Postres\n4. Bebidas")
                var pla: Int = readLine()!!.toInt()
                when (pla) {
                    1 -> {
                        println("Las entradas registradas son:")
                        for (i in nomEntrada.indices) {
                            println("---------------------------------------------------------------------------------------------------------------------")
                            println("Nombre: ${nomEntrada[i]}\nDescripcion: ${descEnt[i]}\nPrecio: ${precEnt[i]}\n")
                            println("---------------------------------------------------------------------------------------------------------------------")
                        }
                    }
                    2 ->{
                        println("Los Platos Fuertes registrados son:")
                        for (i in nomEntrada.indices) {
                            println("---------------------------------------------------------------------------------------------------------------------")
                            println("Nombre: ${nomPlatoFue[i]}\nDescripcion: ${descPlatoFue[i]}\nPrecio: ${precPlatoFue[i]}\n")
                            println("---------------------------------------------------------------------------------------------------------------------")
                        }
                    }
                    3 ->{
                        println("Los Postres registrados son:")
                        for (i in nomEntrada.indices) {
                            println("---------------------------------------------------------------------------------------------------------------------")
                            println("Nombre: ${nomPost[i]}\nDescripcion: ${descPost[i]}\nPrecio: ${precPost[i]}\n")
                            println("---------------------------------------------------------------------------------------------------------------------")
                        }
                    }
                    4 ->{
                        println("Las Bebidas registradas son:")
                        for (i in nomEntrada.indices) {
                            println("---------------------------------------------------------------------------------------------------------------------")
                            println("Nombre: ${nomBeb[i]}\nDescripcion: ${descBeb[i]}\nPrecio: ${precBeb[i]}\n")
                            println("---------------------------------------------------------------------------------------------------------------------")
                        }
                    }
                }
            }
//            La tercera opcion es la de consultar un plato por codigo, esta opcion no cambia mucho en comparaciona a la anterior
            3 -> {
//                Primero se le pregunta al usuario a que categoria pertenece el plato que desea consultar. El usuario digita la categoria.
                println("Usted selecciono la opcion consulta plato por codigo\n¿A que categoria desea consultar?\n1. Entradas\n2. Platos Fuertes\n3. Postres\n4. Bebidas")
                var pla: Int = readLine()!!.toInt()
                /* Con el condicional When se clasifica cada una de las categorias y se le pide al usuario que ingrese el codigo del plato. Con el codigo suministrado por el usuario
                se hace la consulta por pocision y se muestrasn los datos resgitrados del plato*/
                when (pla) {
                    1 -> {
                        println("Usted selecciono la categoria Entradas\nIngrese el codigo del plato:\n")
                        var cod:Int = readLine()!!.toInt()
                        println("El codigo ${cod} pertenece a la entrada\nNombre: ${nomEntrada[cod]}\nDescripcion: ${descEnt[cod]}\nPrecio: ${precEnt[cod]}\n")
                    }
                    2 -> {
                        println("Usted selecciono la categoria Platos Fuertes\nIngrese el codigo del plato:\n")
                        var cod:Int = readLine()!!.toInt()
                        println("El codigo ${cod} pertenece al plato fuerte\nNombre: ${nomPlatoFue[cod]}\nDescripcion: ${descPlatoFue[cod]}\nPrecio: ${precPlatoFue[cod]}\n")
                    }
                    3 -> {
                        println("Usted selecciono la categoria Postres\nIngrese el codigo del plato:\n")
                        var cod:Int = readLine()!!.toInt()
                        println("El codigo ${cod} pertenece al postre\nNombre: ${nomPost[cod]}\nDescripcion: ${descPost[cod]}\nPrecio: ${precPost[cod]}\n")
                    }
                    4 -> {
                        println("Usted selecciono la categoria Bebidas\nIngrese el codigo del plato:\n")
                        var cod:Int = readLine()!!.toInt()
                        println("El codigo ${cod} pertenece a la bebida\nNombre: ${nomBeb[cod]}\nDescripcion: ${descBeb[cod]}\nPrecio: ${precBeb[cod]}\n")
                    }
                }
            }
//            La opcion 4 permite al usuario modificar un plato resgitrado. Primero se le pide que por favor ingrese la categoria a la que pertenece el plato
            4-> {
                println("Usted selecciono la opcion modificar un plato\n¿A que categoria pertenece el plato?\n1. Entradas\n2. Platos Fuertes\n3. Postres\n4. Bebidas")
                var pla: Int = readLine()!!.toInt()
                /*Luego dependiendo del valor digitado se ejecutara un bloque de codigo en el cual se solicitara la posicion en la que se encuentra el plato a modificar. Se le muestra
                el plato registrado en esa posicion y se le pregunta que valor es el que desea cambiar (Nombre - Descripcion - Precio)*/
                when (pla) {
                    1 -> {
                        println("Usted selecciono la categoria Entradas\nIngrese el codigo del plato que desea modificar:\n")
                        var cod: Int = readLine()!!.toInt()
                        println("El plato resgistrado con ese codigo es:\nNombre: ${nomEntrada[cod]}\nDescripcion: ${descEnt[cod]}\nPrecio: ${precEnt[cod]}\n¿Que desea modificar?\n1. Nombre\n2. Descripcion\n3. Precio")
                        var mod: Int = readLine()!!.toInt()
                        /*Dependiendo de la seleccion hecha se le solicitara digite el nuevo valor remplazara al elemento resgistrado y al final se le mostrara cual fue el elemento
                        modicficado y el valor que este tiene*/
                        when (mod) {
                            1 -> {
                                println("Ingrese el nuevo nombre del plato:\n")
                                var newNom: String = readLine().toString().lowercase()
                                nomEntrada.set(cod, newNom)
                                println("El plato fue modificado. Ahora tiene como nombre: ${nomEntrada[cod]}")
                            }
                            2 -> {
                                println("Ingrese la nueva descripcion del plato:\n")
                                var newDes: String = readLine().toString().lowercase()
                                descEnt.set(cod, newDes)
                                println("El plato fue modificado. Ahora tiene como descripcion: ${descEnt[cod]}")
                            }
                            3 -> {
                                println("Ingrese el nuevo precio el plato:\n")
                                var newPre: Int = readLine()!!.toInt()
                                precEnt.set(cod, newPre)
                                println("El plato fue modificado. Ahora tiene como precio: ${precEnt[cod]}")
                            }
                        }
                    }
                    2 -> {
                        println("Usted selecciono la categoria Platos Fuertes\nIngrese el codigo del plato que desea modificar:\n")
                        var cod: Int = readLine()!!.toInt()
                        println("El plato resgistrado con ese codigo es:\nNombre: ${nomPlatoFue[cod]}\nDescripcion: ${descPlatoFue[cod]}\nPrecio: ${precPlatoFue[cod]}\n¿Que desea modificar?\n1. Nombre\n2. Descripcion\n3. Precio")
                        var mod: Int = readLine()!!.toInt()
                        when (mod) {
                            1 -> {
                                println("Ingrese el nuevo nombre del plato:\n")
                                var newNom: String = readLine().toString().lowercase()
                                nomPlatoFue.set(cod, newNom)
                                println("El plato fue modificado. Ahora tiene como nombre: ${nomPlatoFue[cod]}")
                            }
                            2 -> {
                                println("Ingrese la nueva descripcion del plato:\n")
                                var newDes: String = readLine().toString().lowercase()
                                descPlatoFue.set(cod, newDes)
                                println("El plato fue modificado. Ahora tiene como descripcion: ${descPlatoFue[cod]}")
                            }
                            3 -> {
                                println("Ingrese el nuevo precio el plato:\n")
                                var newPre: Int = readLine()!!.toInt()
                                precPlatoFue.set(cod, newPre)
                                println("El plato fue modificado. Ahora tiene como precio: ${precPlatoFue[cod]}")
                            }
                        }
                    }
                    3 -> {
                        println("Usted selecciono la categoria Postres\nIngrese el codigo del plato que desea modificar:\n")
                        var cod: Int = readLine()!!.toInt()
                        println("El plato resgistrado con ese codigo es:\nNombre: ${nomPost[cod]}\nDescripcion: ${descPost[cod]}\nPrecio: ${precPost[cod]}\n¿Que desea modificar?\n1. Nombre\n2. Descripcion\n3. Precio")
                        var mod: Int = readLine()!!.toInt()
                        when (mod) {
                            1 -> {
                                println("Ingrese el nuevo nombre del postre:\n")
                                var newNom: String = readLine().toString().lowercase()
                                nomPost.set(cod, newNom)
                                println("El postre fue modificado. Ahora tiene como nombre: ${nomPost[cod]}")
                            }
                            2 -> {
                                println("Ingrese la nueva descripcion del postre:\n")
                                var newDes: String = readLine().toString().lowercase()
                                descPost.set(cod, newDes)
                                println("El postre fue modificado. Ahora tiene como descripcion: ${descPost[cod]}")
                            }
                            3 -> {
                                println("Ingrese el nuevo precio el postre:\n")
                                var newPre: Int = readLine()!!.toInt()
                                precPost.set(cod, newPre)
                                println("El postre fue modificado. Ahora tiene como precio: ${precPost[cod]}")
                            }
                        }
                    }
                    4 -> {
                        println("Usted selecciono la categoria Bebidas\nIngrese el codigo de la bebida que desea modificar:\n")
                        var cod: Int = readLine()!!.toInt()
                        println("El plato resgistrado con ese codigo es:\nNombre: ${nomBeb[cod]}\nDescripcion: ${descBeb[cod]}\nPrecio: ${precBeb[cod]}\n¿Que desea modificar?\n1. Nombre\n2. Descripcion\n3. Precio")
                        var mod: Int = readLine()!!.toInt()
                        when (mod) {
                            1 -> {
                                println("Ingrese el nuevo nombre de la bebida:\n")
                                var newNom: String = readLine().toString().lowercase()
                                nomBeb.set(cod, newNom)
                                println("La bebida fue modificada. Ahora tiene como nombre: ${nomBeb[cod]}")
                            }
                            2 -> {
                                println("Ingrese la nueva descripcion de la bebida:\n")
                                var newDes: String = readLine().toString().lowercase()
                                descBeb.set(cod, newDes)
                                println("El plato fue modificado. Ahora tiene como descripcion: ${descBeb[cod]}")
                            }
                            3 -> {
                                println("Ingrese el nuevo precio de la bebida:\n")
                                var newPre: Int = readLine()!!.toInt()
                                precBeb.set(cod, newPre)
                                println("La bebida fue modificado. Ahora tiene como precio: ${precBeb[cod]}")
                            }
                        }
                    }
                }
            }
//            La opcion 5 permite eliminar un plato ya registrado del menu
            5 ->{
//                Primero le preguntamos al usuario a que categoria pertenece el plato que desea eliminar
                println("Usted selecciono la opcion de eliminar plato\nIngrese la categoria a la que pertenece el plato que desea eliminar\n1. Entradas\n2. Platos Fuertes\n3. Postres\n4. Bebidas")
                var cat:Int = readLine()!!.toInt()
                /* Luego dependiendo de la categoria seleccionada se le pedira que por favor ingrese el codigo (posicion) en la que se encuentra el plato. Con el metodo remove() y la
                posicion digitada por el usuario se eliminara en cad una de las listas el elemento que se encuentra en esa posicion*/
                when (cat){
                    1 ->{
                        println("Usted seleccion la categoria Entradas\nIngrese el codigo del plato que desea eliminar:\n")
                        var cod:Int = readLine()!!.toInt()
                        nomEntrada.removeAt(cod)
                        descEnt.removeAt(cod)
                        precEnt.removeAt(cod)
                        println("La entrada fue eliminada con exito")
                    }
                    2 ->{
                        println("Usted seleccion la categoria Platos Fuertes\nIngrese el codigo del plato que desea eliminar:\n")
                        var cod:Int = readLine()!!.toInt()
                        nomPlatoFue.removeAt(cod)
                        descPlatoFue.removeAt(cod)
                        precPlatoFue.removeAt(cod)
                        println("El plato fuerte fue eliminado con exito")
                    }
                    3 ->{
                        println("Usted seleccion la categoria Postres\nIngrese el codigo del plato que desea eliminar:\n")
                        var cod:Int = readLine()!!.toInt()
                        nomPost.removeAt(cod)
                        descPost.removeAt(cod)
                        precPost.removeAt(cod)
                        println("El postre fue eliminado con exito")
                    }
                    4 ->{
                        println("Usted seleccion la categoria Bebidas\nIngrese el codigo del plato que desea eliminar:\n")
                        var cod:Int = readLine()!!.toInt()
                        nomBeb.removeAt(cod)
                        descBeb.removeAt(cod)
                        precBeb.removeAt(cod)
                        println("La bebida fue eliminada con exito")
                    }
                }
            }
        }
//        Se le pregunta si desea hacer otra accion en el sistema. Si es asi se le mostrara de nuevo el menu con las acciones.
        println("¿Desea realizar otra accion?")
        resp1 = readLine().toString().lowercase()
    }
//    Si no se le agradece por usar el programa y se termina el mismo.
    println("Gracias por usar nuestro programa!")
}