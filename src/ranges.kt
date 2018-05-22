fun main(args: Array<String>) {
    val oneToTen = 1..10

    val alphaList = "A".."Z"

    println("R in alphaList: ${"R" in alphaList}")

    val tenToOne = 10.downTo(1) // 10,9,8..1    Type: IntProgressive
    val twoTo20 = 2.rangeTo(20)

    val rng3 = oneToTen.step(3) //1 4 7 10

    for (x in rng3) println("rng3: $x")

    for (x in tenToOne.reversed()) println("Reverse: $x")


}