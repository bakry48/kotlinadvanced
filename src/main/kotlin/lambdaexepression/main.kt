package lambdaexepression

// two ways to write lambda exepression
// first way val lambda_name : (Parameter Data Types) -> Return Data type = {Parameters -> Logic}
//Second Way val lambda_name={Parameters and Types -> Logic}

fun main() {
    val exp1 :(Int , Int) -> Int = {x,y->x+y}

    val exp2={a:Int , b:Int -> a+b}

    println(exp1(1,2))
    println(exp2(3,4))
}