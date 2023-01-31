package anonymousfunction

fun main() {
    println(anonymous1.invoke(1,2))
    println(anonymous2(1,3))
}

val anonymous1=fun(x:Int , y:Int):Int{
    return x + y
}

val anonymous2=fun(x:Int , y:Int) = x + y