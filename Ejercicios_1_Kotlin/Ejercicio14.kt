fun main() {

    println("Introduce un número:")
    val numero = readLine()?.toIntOrNull()

    if (numero == null || numero <= 1) {

        println("Número no válido. Introduce un número entero mayor que 1")

    } else {

        var primo = true

        for (i in 2 until numero) {

            if (numero % i == 0) {
                primo = false
            }
        }

        if (primo) {
            println("El número es primo")
        } else {
            println("El número no es primo")
        }

    }

}


