import java.util.Random

fun main(args: Array<String>) {

    for(x in 1..10) {   //Looping through Range
        println("Loop: $x")
    }

    /*val rand = Random()
    val magicNum = rand.nextInt(50) + 1

    var guess = 0

    while (magicNum != guess) {
        guess += 1
    }*/

    var arr3: Array<Int> = arrayOf(3,6,9)

    for (i in arr3) {
        println(i)
    }

    for (i in arr3.indices) {
        println("Multi 3: ${arr3[i]}")
    }

    for ( (index,value) in arr3.withIndex() ) {
        println("$index,$value")
    }

}