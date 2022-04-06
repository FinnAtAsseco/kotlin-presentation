package dk.asseco.kotlin.presentation.language

/**
 * Example with enum values
 */
enum class AnimalType {
    HORSE,
    WASP,
    PINK_UNICORN
}

fun howManyLegs(animalType: AnimalType): Int =
    when (animalType) {
        AnimalType.HORSE -> 4
        AnimalType.WASP -> 6
        AnimalType.PINK_UNICORN -> 2
    }

/**
 * Example with classes
 */
sealed class Animal {
    abstract fun numberOfLegs(): Int
}

class Horse : Animal() {
    override fun numberOfLegs() = 4
}

class Wasp : Animal() {
    override fun numberOfLegs() = 6
}

class Dog : Animal() {
    override fun numberOfLegs() = 2
}

class DoStuffWithAnimal {
    fun rideIt(horse: Horse) {
        println("Wheee!")
    }

    fun petIt(unicorn: Dog) {
        println("Pet it!")
    }

    fun shooIt(wasp: Wasp) {
        println("Ouch!")
    }

    fun stuff(animal: Animal) {
        when (animal) {
            is Horse -> rideIt(animal)
            is Dog -> petIt(animal)
            is Wasp -> shooIt(animal)
        }
    }
}
