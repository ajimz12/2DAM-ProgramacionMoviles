fun main() {

    println("Introduce el nombre de un día (lunes a viernes):")
    val dia = readln()

    val horarioClases = when (dia){

        "lunes" -> "1º HLC - 2º Ingles - 3º Des.Interfaces - 4º Des.Interfaces - 5º Des.Interfaces - 6º Des.Interfaces"
        "martes" -> "1º PSP - 2º PSP - 3º PSP - 4º Acceso Datos - 5º Acceso Datos - 6º Acceso Datos"
        "miércoles" -> "1º SGE - 2º SGE - 3º SGE - 4º SGE - 5º EIE - 6º EIE"
        "jueves" -> "1º EIE - 2º EIE - 3º Prog.Moviles - 4º Prog.Moviles - 5º Prog.Moviles - 6º Prog.Moviles"
        "viernes" -> "1º Acceso Datos - 2º Acceso Datos - 3º Acceso Datos - 4º Des.Interfaces - 5º Des.Interfaces - 6º Des.Interfaces"

        else -> "Día no válido o no hay clases ese día."
    }

    println("El horario de clases para el $dia es:")
    println(horarioClases)

}