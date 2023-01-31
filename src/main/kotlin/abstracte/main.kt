package abstracte

fun main() {
    var cats:Animal=Cat()

    cats.name="Kitty"
    println(cats.name)
    println(cats.averageAge)
    cats.animalSound()
    cats.sn="ahmed"
    println(cats.sn)
}