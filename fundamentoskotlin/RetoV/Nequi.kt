package com.AngelB6.fundamentoskotlin.RetoV

class RetoV {

}

fun main() {
//    Creamos e inicializamos las variables que van a ser utilizadas a lo largo del programa
    val Numero:Long=3112310715
    val Clave:Int=2006
    var cont:Int=4
    var saldo:Int =4500
    /* Creamos la funcion saca() que le permitira al usuario sacar dinero de su cuenta. En esta primero crearemos una lista la cual almacenara el codigo de 6 digitos que se generara
    con el metodo random() para que sea mas sencillo mostrarselo al usuario. Preguntamos al usuario porque medio desea retirar el dinero, comrpobamos por medio de una condicional que
    el saldo sea mayor a $2000 (Retiro minimo). Si el saldo es menor a $2000 se le mostrara un mensaje diciendole que no es posible hacer el retiro. Si el saldo es mayo a $2000 se
    le solicitara el valor que desea retirar con otra condicional evaluamos que el valor ingresado no sobre pase el saldo. Si no lo sobre pasa genera el codigo de 6 digitos y que se
    le mostrar al usuario asi como el saldo final despues del retiro. Si lo sobre pasa se le mostrara un mensaje diciendo que no cuenta con saldo suficiente*/
    fun saca(){
        val codigoFi = mutableListOf<Int>()
        println("Por favor ingrese la opcion en la que desea retirar\n1. Cajero\n2. Punto Fisico")
        var opcion:Int = readLine()!!.toInt()
        if (saldo<2000){
            println("Disculpe pero no le alcanza su saldo para retirar. Usted tiene $${saldo} y necesita minimo $2000")
        }else{
            println("Ingrese el valor que desea retirar\n")
            var valReti:Int = readLine()!!.toInt()
            if (valReti<saldo){
                for (i in 1..6){
                    var codigo:Int=(0..9).random()
                    codigoFi.add(codigo)
                }
                println("Su codigo para retirar es: ${codigoFi}")
                saldo=saldo-valReti
                println("Su saldo quedo en: $${saldo}")
            }else{
                println("Saldo insuficiente. Su saldo es de $${saldo}")
            }
        }
    }
    /* Creamos la funcion envia() que permitira enviar dinero a un numero digitado por el usuario. Primero se le mostrara al usuario su saldo, se le pedira digite el numero al cual
    se le va a realizar el envio y el valor a enviar. Con una condicional comprobamos que el valor a enviar no sobre pase el valor del saldo. Si no lo sobre pasa se le motrara un
    mensaje al usuario diciendole que el envio fue realizado con exito. Si lo sobre pasa se le dira que no cuenta con saldo suficiente*/
    fun envia(){
        println("Su saldo es de: $${saldo}\nPor favor ingrese el numero de telefono al cual desea enviar el dinero")
        var numEnv:Long = readLine()!!.toLong()
        println("Ingrese el valor que desea enviar\n")
        var valEnv:Int = readLine()!!.toInt()
        if (valEnv<saldo){
            saldo=saldo-valEnv
            println("Envio realizado con exito!\nSu saldo es de $${saldo}")
        }else{
            println("No cuenta con saldo suficiente para realizar este envio. Su saldo es de $${saldo}")
        }
    }
    /*Creamos la funcion recarga() que permitira recargar la cuenta con un valor ingresado por el usuario. Primero se le mostrara el saldo y se le pedira que ingrese el valor a
    recargar. Luego se le pedira que confirme que desea realizar la recarga. Con un condicional evaluamos la respuesta, si esta es si se le mostrara un mensaje diciendo que la recarga
    fue realizada con exito. Si la respuesta es diferente se le mostrara un mensaje diciendo que la recarga fue cancelada*/
    fun recarga(){
        println("Su saldo es de $${saldo}\nPor favor ingrese el valor de la recarga\n")
        var valRe:Int = readLine()!!.toInt()
        println("¿Esta seguro de realizar la recarga?")
        var resp:String = readLine().toString().lowercase()
        if (resp=="si"){
            saldo=saldo+valRe
            println("La recarga fue realizada con exito!\nSu saldo es de $${saldo}")
        }else{
            println("La recarga fue cancelada")
        }
    }
    /*Para la comprobacion de datos creamos un ciclo for el cual tiene como maximo 4 oportunidades para poder ingresar al sistema. Se le pide al usuario los datos nuemro de celular y
    clave. Estos por medio de un condicional se verifica que sean correctos. Si es asi se le permite el ingreso y se le muestra un menu. Si no es asi se le mostrara cuantas
    oportunidades le quedan para poder ingresar. En el menu encontrara las distintas acciones que puede realizar en el sistema. Dependiendo de la seleccion del usuario con una
    condicional When se llamara a alguna de las funciones anteriormente explicadas*/
    for (i in 1.. 4) {
        println("Por favor ingrese su numero de celular:\n")
        var numC: Long = readLine()!!.toLong()
        println("Por favor ingrese la clave:\n")
        var claveC: Int = readLine()!!.toInt()
        if (numC==Numero && claveC==Clave){
            println("Bienvenido a nequi!\nSu saldo es de: $${saldo}")
            println("¿Desea iniciar un proceso?")
            var resp1:String = readLine().toString().lowercase()
            while (resp1=="si") {
                println("Por favor seleccione alguno de las siguientes opciones\n1. Saca\n2. Envia\n3. Recarga\n4. Salir")
                var resp:Int= readLine()!!.toInt()
                when (resp) {
                    1 -> {
                        println("Usted selecciono la opcion Saca")
                        println(saca())
                    }
                    2 -> {
                        println("Usted selcciono la opcion Envia")
                        println(envia())
                    }
                    3 ->{
                        println("Usted selecciono la opcion Recarga")
                        println(recarga())
                    }
                    4 ->{
                        break
                    }
                }
//                Se le pregunta al usuario si desea realizar otra accion en el sistema
                println("¿Desea realizar otra accion?")
                resp1= readLine().toString().lowercase()
            }
//            Se rompe el ciclo for
            break
        }else{
            cont=cont-1
            println("Ups! Ingresoe un dato incorrecto. Usted tiene ${cont} intentos mas")
        }
    }
//    Se  muestra un mensaj de despedida
    println("Gracias por usar Nequi:)")
}