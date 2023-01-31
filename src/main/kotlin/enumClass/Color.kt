package enumClass

enum class Color(val code:String) {
    RED("#25224"){
        override fun toString(): String {
            return "Red Color"
        }
                 },
    GREEN("#45224"),
    BLUE("#24524"),
    WHITE("#23324")
}