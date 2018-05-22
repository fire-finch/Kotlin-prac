fun main(args: Array<String>) {
    val divisor = 0

    try {
        if (divisor == 0) {
            throw IllegalArgumentException("Can't Divide by 0")
        } else {
            println("5 / $divisor = ${5/divisor}")
        }
    } catch (e: IllegalArgumentException) {
        println(e.message)  //Can't Divide by 0
    }
}