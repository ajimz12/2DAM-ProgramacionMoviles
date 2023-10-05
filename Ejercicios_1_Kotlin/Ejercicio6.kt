fun main(){

    println("Introduce el precio del artículo: ")
    val precio = readln().toDoubleOrNull()


    println("Introduce el dinero recibido: ")
    val dinero = readln().toDoubleOrNull()


    if(precio == null || precio < 0){

        println("El precio debe ser un número mayor o igual a 0")
        return

    }

    if(dinero == null){

        println("El dinero debe ser un número")
        return

    }

    if(dinero < precio){

        println("Se han recibido " + dinero + "€")
        println("Faltan " + (precio - dinero) + "€")

    }else if(dinero > precio){

        println("Se han recibido " + dinero + "€")
        println("El cambio es de " + (dinero - precio) + "€")

    }else{

        println("Se ha recibido el dinero exacto")

    }

}