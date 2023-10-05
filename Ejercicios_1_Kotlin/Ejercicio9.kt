fun main() {

    println("Introduce una frase: ")
    val frase = readln().toString()

    val cond = frase.trim().split(Regex("\\s+"))
    var palabras = cond.size

    if (frase.isBlank()){

        palabras = 0
    }

    println("En la frase hay " + palabras + " palabras")


}