fun main(args: Array<String>) {

    fun add(num1: Int, num2: Int) : Int = num1 + num2    //Single line function

    /*Single line functions need not specify Return Types
    * Also function arguments can have default values
    * */

    fun substract(num1: Int = 10, num2: Int = 10) = num1 - num2

    println("${add(5,4)},${substract(3,2)}")

    println(substract(num2 = 1, num1 = 10))     //We can specify parameter name


    fun sayHello(name: String) : Unit = println("Hi $name")     //Fn with no return returns Unit

    val (two,three) = nextTwo(1)

    println("$two,$three")




}


fun nextTwo(num: Int) : Pair<Int,Int> {
    return Pair(num+1,num+2)
}