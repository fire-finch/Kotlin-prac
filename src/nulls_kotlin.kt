fun main(args: Array<String>) {
    //var nullVal: String = null    //Invalid
    var nullVal: String? = null     //Valid

    /*fun returnNull():String {     //Invalid
        return null
    }*/

    fun returnNull():String? {      //Valid
        return null
    }



    //Kotlin uses SmartCast when dealing with null comparisons

    //println(nullVal.length)       //Invalid

    if (nullVal != null) {          //Valid
        println(nullVal.length)
    }


    //Force Operator: It forces Null values (!!)

    //var nullVal2 = nullVal.length     //Invalid
    var nullVal2 = nullVal!!.length     //Valid, Null values forced by Force operator



    //Elvis Operator ?:
    var name: String = getName() ?: "No Name"
    // If value returned by getName() is null, then "No Name" is assigned


}

fun getName(): String? {
    return null
}