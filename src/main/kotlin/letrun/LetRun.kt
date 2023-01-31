package letrun

import java.io.FileOutputStream

data class ProgramingNames(var name:String)

class Developer(){
    lateinit var name:String
    lateinit var pl:List<ProgramingNames>
    fun test1(){
        println("1")
    }
    fun test2(){
        println("2")
    }


}

fun main() {
//    val p1:Developer=Developer().apply {
//        name="ahmed"
//        pl= listOf(ProgramingNames("Kotlin") , ProgramingNames("java"))
//
//    }

    val p1:Developer=Developer().also {
        it.name="ahmed"
        it.pl= listOf(ProgramingNames("Kotlin") , ProgramingNames("java"))

    }
    // not working with null safe
    with(p1){
        test1()
        test2()
    }
    // like with but working with null safe if p1:Developer?     make p1?.run
    p1.run {
        test2()
        test1()
    }
    // create method or variable run just in block
    p1.let {
        var myname="ali"
        println(myname)
    }
println(p1.pl)

}