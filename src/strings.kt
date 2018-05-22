fun main(args: Array<String>) {
    val name = "anirudh"
    val longStr = """This is a
long string"""

    var name2: String = "ani"

    println("Name: $name")

    println("Strings Equal: ${"ABC".equals("ABC")}")

    println("Compare A and B: ${"A".compareTo("B")}")

    var str1 = "A random str"
    println("Index 2 to 7: ${str1.subSequence(2,8)}")
    
}