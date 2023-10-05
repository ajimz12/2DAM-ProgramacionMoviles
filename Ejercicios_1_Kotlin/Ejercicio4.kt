fun main(){

    println("Horas de Lenguaje de Marcas: ")
    val lmsgi = readln().toInt()

    println("Horas de Programación: ")
    val prog = readln().toInt()

    println("Horas de Sistemas Informáticos: ")
    val sist = readln().toInt()

        println("Horas de ausencia: ")
        val ausencia = readln().toInt()

        val horasTotales = lmsgi + prog + sist
        val porcentajeFaltas = 100 * ausencia / horasTotales


        if (ausencia > horasTotales) {

            println("No pueden existir más horas de ausencia que horas totales")
            return

        }

        if (porcentajeFaltas >= 20) {

            println("Se han superado las faltas máximas permitidas")

        } else {

            println("No se han superado las faltas máximas permitidas")

        }


    }
