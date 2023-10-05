fun main() {


    println("Ingrese una lista de palabras:")
    val lista = readLine()?.split(" ")

    if (lista == null || lista.isEmpty()) {

        println("No se pudo leer la lista")

    } else {

        println("Ingrese la letra que desea buscar:")
        val letra = readLine()?.singleOrNull()

        if (letra == null) {

            println("Letra inválida. Debe ser una única letra.")
            return

        }

        val palabraLetra = lista.count { palabra -> letra in palabra }

        println("${palabraLetra} palabras contienen la letra " + letra)



    }
}