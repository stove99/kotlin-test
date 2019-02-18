class Test (val name: String, val age: Int = 30) {
    override fun toString(): String{
        return "$name's age is $age"
    }

    override fun equals(other: Any?) : Boolean {
        when( other ){
            is Test -> return other.name.equals(this.name) && other.age == this.age;
            else -> return false;
        }
    }
}

fun Double.format(digit: Int) = java.lang.String.format("%.${digit}f", this)

fun Double.format2(digit: Int): String {
    return java.lang.String.format("%.${digit}f", this)
}

fun main(args: Array<String>){
    val t:Test = Test("stove")
    val other:Test = Test("stove", 25)

    println(t);
    println("${t.equals(other)}"  )

    var value = 3.141592;
    println("${value.format(2)}")
    println("${value.format2(3)}")
}