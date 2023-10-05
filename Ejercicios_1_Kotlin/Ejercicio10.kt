import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.io.IOException

fun main() {

    println("Introduce la ruta del archivo: ")
    val ruta = readln()

    val f = File(ruta)

    try{

        val br = BufferedReader(FileReader(f))
        val numLineas = br.readLines()

        for (linea in numLineas){

            println(linea)

        }

        br.close()

    }catch (e: IOException){

        println("No se pudo leer el archivo: " + e.message)

    }


}