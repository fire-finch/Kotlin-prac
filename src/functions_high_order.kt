fun main(args: Array<String>) {

    val numList = 1..20

    // If a function takes one argument,
    // we can call that argument "it"
    val evenList = numList.filter { it % 2 == 0 }

//    evenList.forEach { println(n -> println(n)) }
    evenList.forEach { println(it) }


    val mult3 = makeMathFunc(3)     //mult3 is a function

    println("5 * 3 = ${mult3(5)}")        //15

}

fun makeMathFunc(num1: Int): (Int) -> Int = {num2 -> num1 * num2}