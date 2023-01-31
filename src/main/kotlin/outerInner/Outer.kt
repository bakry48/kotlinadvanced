package outerInner

class Outer {

    val outerName="Outer Class"

   inner class Inner{
        fun printOuterName(){
            println(outerName)
        }
    }
}