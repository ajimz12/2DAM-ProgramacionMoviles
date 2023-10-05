
fun main() {
    val palabra = "ahorcado"
    val letras = mutableSetOf<Char>()
    val maxIntentos = 10

    var intentos = 0

    println("Bienvenido al juego del ahorcado!")
    println("Adivina la palabra secreta.")

    while (intentos < maxIntentos) {


        val oculto = palabra.map { if (it in letras) it else '_' }.joinToString(" ")
        println("Palabra: $oculto")

        println("Introduce una letra:")
        val letra = readLine()?.trim()?.firstOrNull()


        if (letra == null || letra !in 'a'..'z') {

            println("Ingresa una letra válida.")
            continue
        }

        if (letra in letras) {

            println("Letra ya adivinada")
            continue
        }

        if (letra in palabra) {

            println("Letra correcta")
            letras.add(letra)

        } else {

            println("Letra incorrecta - " + (maxIntentos - intentos - 1) + " intentos restantes")
            intentos++
        }

        if (palabra.all { it in letras }) {

            println("Palabra adivinada - Victoria!")

        }
    }

    if (intentos == maxIntentos) {
        println("Te quedaste sin intentos - Derrota - La palabra era " + palabra)
    }
}
