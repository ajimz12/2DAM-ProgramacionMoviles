fun main() {

    var seguir = true

    while(seguir){

    println("Ingrese su número de DNI:")
    val dni = readLine()

    if (dni == null || dni.length != 9 || !dni.substring(0, 8).all { it.isDigit() }) {

        println("DNI no válido, debe contener 8 números y 1 letra")

    } else {

        println("El número de DNI es válido")
        seguir = false

        }

    }

}