fun main() {

    val passwd = "contraseña"
    var intentos = 5

    while(intentos > 0){

    println("Introduce la contraseña: ")
    val usrpasswd = readln()

        if(usrpasswd != passwd){

            intentos--
            println("Contraseña incorrecta!")
            println("$intentos intentos restantes")

        }else{

            println("Contraseña acertada!")
            intentos = 0
        }

    }

}

