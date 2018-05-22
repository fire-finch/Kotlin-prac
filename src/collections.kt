fun main(args: Array<String>) {
    //Working on collections (Arrays, Lists, Maps etc)

    val x = 20

    val numList = 1..x

    val listSum = numList.reduce{ x, y -> x + y }
    println(listSum)        //210

    //Fold is same as reduce, but takes an initial value
    val listSumFold = numList.fold(5){ x, y -> x + y }
    println(listSumFold)    //215

    println("Any one is Even: ${numList.any({ it % 2 ==0 })}")
    println("All are Even: ${numList.all { it % 2 ==0 } }")



    val big3 = numList.filter { it > 3 }
    big3.forEach { n -> println(n) }    //4 5 6 .. 20

    val times7 = numList.map { it * 7 }
    times7.forEach { n -> println(n) }

}