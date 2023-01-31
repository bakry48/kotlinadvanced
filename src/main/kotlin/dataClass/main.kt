package dataClass

fun main() {
    val emp1=EmpData("ahmed bakry" , 125)
    val emp2=EmpData("ahmed bakry" , 125)

    println(emp1.hashCode())
   var mob:String = emp2.mobile.toString()
    println(emp1.equals(emp2))
    println("${emp1.hashCode()} : ${emp2.hashCode()}")
}