fun main(){
    val nombre = "Carlos"
    val edad = 33
    println("======Método1======")
    println(calcularPrecioMetodo1(nombre, edad))
    println("======Método2======")
    println(calcularPrecioMetodo2(nombre, edad))
}

fun calcularPrecioMetodo1(nombre: String, edad: Int) : String {
    when {
        edad < 18 -> {
            return "$nombre, debes abonar 5€"
        }
        edad < 65 -> {
            return "$nombre, debes abonar 10€"
        }
        else -> {
            return "$nombre, para ti es gratis"
        }
    }
}


fun calcularPrecioMetodo2(nombre: String, edad: Int) : String {
    return when {
        edad < 18 -> {
            "$nombre, debes abonar 5€"
        }
        edad < 65 -> {
            "$nombre, debes abonar 10€"
        }
        else -> {
            "$nombre, para ti es gratis"
        }
    }
}