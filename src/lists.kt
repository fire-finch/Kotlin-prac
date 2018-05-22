fun main(args: Array<String>) {
    var list1: MutableList<Int> = mutableListOf(1,2,3,4,5) //Mutable or Changeable List
    val list2: List<Int> = listOf(1,2,3,4,5)               //Immutable or Unchangeable List

    list1.add(6);

    println(list1.first())
    println(list1.last())
    println(list1[2])

    var list3 = list1.subList(0,3)
    list3.forEach { x -> println(x) }   //1 2 3

    list3.clear()

    println()

    list1.remove(1)     //Element 1
    list1.removeAt(1)     //Index 1

    list1.forEach { x -> println(x) }   //4 6
    // Note that changes in subList were reflected back to original list
    //The returned list is backed by this list, so non-structural changes in the returned list are reflected in this list, and vice-versa.


}