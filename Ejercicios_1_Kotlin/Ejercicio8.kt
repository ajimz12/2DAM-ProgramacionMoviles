fun main() {

    var quinientos = 500
    var cien = 100
    var cincuenta = 50
    var veinte = 20
    var diez = 10
    var dos = 2
    var uno = 1

    println("Introduce una cantidad de dinero: ")
    val dinero = readln().toDoubleOrNull()

    if(dinero == null || dinero <= 0){

        println("El valor introducido no es válido")

    }else{

        var cantidadRestante = dinero.toInt()

        quinientos = cantidadRestante / 500
        cantidadRestante %= 500
        cien = cantidadRestante / 100
        cantidadRestante %= 100
        cincuenta = cantidadRestante / 50
        cantidadRestante %= 50
        veinte = cantidadRestante / 20
        cantidadRestante %= 20
        diez = cantidadRestante / 10
        cantidadRestante %= 10
        dos = cantidadRestante / 2
        cantidadRestante %= 2
        uno = cantidadRestante

        println("Billetes y monedas:")

        println("Billetes de 500 euros: " + quinientos)
        println("Billetes de 100 euros: " + cien)
        println("Billetes de 50 euros: " + cincuenta)
        println("Billetes de 20 euros: " + veinte)
        println("Billetes de 10 euros: " + diez)
        println("Monedas de 2 euros: " + dos)
        println("Monedas de 1 euro: " + uno)

    }

}