fun main(){

    val numPreguntas = 10
    val numOpciones = 3
    val correctas = 10
    val incorrectas = 0
    val penalizacion = true



        val puntosBien = correctas.toDouble()
        val puntosMal = if (penalizacion) incorrectas.toDouble() else 0.0

        val totalPuntos = numPreguntas.toDouble()

        val nota = (puntosBien - (puntosMal / (numOpciones - 1))) / totalPuntos * 10.0

        println("La nota es: " + nota)

    }



