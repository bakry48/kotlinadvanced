package higherorderfunction

fun main() {
printTwoNumber(::addTwo)
    printTwoNumber(lambdaAdd)

    val x= 11

    when(x){
         10 , 11-> println("ok")
         else -> println("not ok")
    }
}

// higher order function is mean we put sample of function what parameter is and what reurn and do what print inside

fun printTwoNumber(func:(num1:Int , num2:Int)->Int){
    println(50 + func(10 , 20))
}

 fun addTwo(x:Int , y:Int)=x-y
val lambdaAdd={x:Int , y:Int -> x+y}