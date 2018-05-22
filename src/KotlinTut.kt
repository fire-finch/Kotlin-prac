package demo

fun main(args: Array<String>) {
    println("Hello World")

    val name = "Anirudh"
    var age = 20

    var bigInt: Int = Int.MAX_VALUE

    println("Yoo $bigInt")

    if(true is Boolean) {
        print("true is boolean\n")
    }

    var letter: Char = 'A'
    println("A is a Char: ${letter is Char}")

}