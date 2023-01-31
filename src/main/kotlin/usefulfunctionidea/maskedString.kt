package usefulfunctionidea

fun main(){
    fun String.masked(cardType : String?) : String{
        val firsttwonumber= this.substring(0,2)
       return when(cardType) {
           "Credit" -> "$firsttwonumber*******${this.substring(this.length - 4)}" // show last four number
           "debit" -> "$firsttwonumber###${this.substring(this.length -6)}" // show last six number
           else -> "-"
       }
    }

    val creditNo  = "255655855522225"
    println(creditNo.masked("debit"))
}