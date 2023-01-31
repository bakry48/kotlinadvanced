package tuples

fun printNameAge(id:Int):Pair<String , Int>{
    var myList=ArrayList<Pair<String, Int>>()
    myList.add(Pair("ahmed" , 25))
    myList.add(Pair("mohamed" , 22))
    myList.add(Pair("youssef" , 20))
    return myList[id]
}
fun main() {
    var (name , age)= printNameAge(2)
    println(name)
println(printNameAge(1))
}