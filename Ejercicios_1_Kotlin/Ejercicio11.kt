import jdk.incubator.vector.DoubleVector
import kotlin.math.truncate

fun main() {

    println("Introduce la primera nota: ")
    val nota1 = readln().toDoubleOrNull()

    println("Introduce la segunda nota: ")
    val nota2 = readln().toDoubleOrNull()

    println("Introduce la tercera nota: ")
    val nota3 = readln().toDoubleOrNull()

    if ((nota1 == null || nota1 < 0 || nota1 > 10 ) ||
        (nota2 == null || nota2 < 0 || nota2 > 10 ) ||
        (nota3 == null || nota3 < 0 || nota3 > 10 )){

        println("Nota no válida, debe estar entre 0 y 10")


    }else {

        val mayorNota = maxOf(nota1, nota2, nota3)
        var menorNota = minOf(nota1, nota2, nota3)
        val media = (nota1 + nota2 + nota3) / 3

        if (nota1 == nota2 && nota2 == nota3) {

            println("Los 3 numeros son iguales")
            println("Nota media: " + truncate(media))

        } else {

            println("Mayor nota: " + mayorNota)
            println("Menor nota: " + menorNota)
            println("Nota media: " + truncate(media))

        }

    }

}