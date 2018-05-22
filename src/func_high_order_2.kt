fun main(args: Array<String>) {

    var multiply2 = {num1: Int -> num1 * 2}

    val myList = arrayOf(1,2,3,4,5)

    mathOnList(myList, multiply2)       //2 4 6 8 10


}

fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int) {    //Accepting functions as Arguments
    for (num in numList) {
        println("mathOnList: ${myFunc(num)}")
    }
}