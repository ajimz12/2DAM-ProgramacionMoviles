fun main() {

    println("Introduce el precio del producto:")
    val precio = readLine()?.toDoubleOrNull()

    if (precio == null || precio < 0) {

        println("El número debe ser positivo.")
        return

    }

    println("Introduce el porcentaje de descuento:")
    val desc = readLine()?.toDoubleOrNull()


    if (desc == null || desc < 0 || desc > 100) {

        println("El porcentaje debe estar entre 0 y 100.")
        return


    }

        val descuento = precio * (desc / 100)
        val precioFinal = precio - descuento


        println("Descuento: $descuento %")
        println("Precio final: $precioFinal €")


    }


