fun main(){


    val dolares = 1.05
    val libras = 0.86
    val yens = 157.45

    var seguir = true

        while (seguir == true) {


            println("Introduce una cantidad en euros: ")
            val eur = readln().toDoubleOrNull()


            if (eur == null || eur < 0) {

                println("El numero debe ser positivo")


            } else {


                println("La cantidad de $eur€ a dolares es: " + dolares * eur + "$")
                println("La cantidad de $eur€ a libras es: " + libras * eur + "£")
                println("La cantidad de $eur€ a yens es: " + yens * eur + "¥")

                seguir = false

            }


        }

}