package abstracte

class Cat : Animal() {
    override var averageAge: Int=15


    override fun animalSound() {
        print("Mewwwwww")
    }
}