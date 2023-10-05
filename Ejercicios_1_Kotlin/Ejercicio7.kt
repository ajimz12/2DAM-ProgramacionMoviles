import java.util.GregorianCalendar

fun main() {

    println("Introduce el año: ")
    val año = readln().toIntOrNull()

    val calendario = GregorianCalendar()

    if(año == null){

        println("El valor introducido no es válido")

    }else{

        if(calendario.isLeapYear(año)){

            println("El año " + año + " es bisiesto")

        }else{

            println("El año " + año + " no es bisiesto")

        }

    }


}