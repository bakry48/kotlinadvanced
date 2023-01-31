package vararg

fun main() {
val nameall= names("ahmed" , "moahmed" , "youseff")
    nameall

    multiplyTable(1,2,3,4,5,6,7,8,9)
}

 fun names(vararg names:String){

     for(name in names){
         println (name)
     }


 }
fun multiplyTable(vararg numbers:Int){
    for(number in numbers){
        println ("Multiply Table For : $number")
        for(i in 1..12){
            println(number*i)
        }
    }
}