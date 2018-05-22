

fun main(args: Array<String>) {
    println(getSum(1,2,3,4,5,6))

    val multiply = {num1: Int, num2: Int -> num1 * num2}
    println(multiply(5,4))

    kotlin.io.println ("Factorial 5 = ${factorial(5)}")
}


fun getSum(vararg nums : Int): Int {        //Variable Arguments

    //nums will be an Array
    var sum = 0

    nums.forEach { n ->sum += n }

    return sum
}

fun factorial(x: Int): Int {
    tailrec fun factTail(y:Int, z:Int): Int {
        if(y==0)return z
        else return factTail(y - 1, y * z)
    }
    return factTail(x,1)
}
