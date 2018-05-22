fun main(args: Array<String>) {
    var myArray = arrayOf(1, 1.23, "Doug")

    println("myArray has Doug: ${myArray.contains("Doug")}")


    var partArray = myArray.copyOfRange(0,1)

    var sqArray = Array(5, {x -> x * x})
    println(sqArray[2]) //4

    var arrInt: Array<Int> = arrayOf(1,2,3); //Type Specific Array
}