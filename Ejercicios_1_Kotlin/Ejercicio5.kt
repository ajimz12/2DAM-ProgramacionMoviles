fun main(){

    var seguir = true // Variable boolean para condicionar al bucle


    while(seguir) { // Bucle que se repite en caso de introducir nota de forma errónea

    println("Introduce la nota: ")
    val nota = readln().toDoubleOrNull() // El usuario introduce la nota por teclado

        if (nota == null || nota < 0 || nota > 10) {

            /* Si el valor de la nota no es numérico o no está entre 0 y 10
               salta error y se repite pregunta */

            println("Nota no válida, debe estar entre 0 y 10")

        } else {

            if (nota < 5) {  // Nota menor que 5 -> suspenso

                println("Suspenso")

            } else if (nota >= 5 && nota < 7) { // Nota mayor o igual a 5 y menor que 7 -> suficiente

                println("Suficiente")

            } else if (nota >= 7 && nota <= 9) { // Nota mayor o igual a 7 y menor que 9 -> notable

                println("Notable")

            } else { // Lo demás es sobresaliente

                println("Sobresaliente")

            }

            seguir = false // Finaliza el bucle

        }

    }

}

