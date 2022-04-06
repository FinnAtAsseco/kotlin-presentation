package dk.asseco.kotlin.presentation.language

data class Person(
    var name: String? = null,
    var email: String? = null,
    var age: Int? = null
)

fun theOldWay() {
    val person = Person()
    person.name = "John Smythe"
    person.email = "john.smythe@bigcorp.com"
    person.age = 32
}

fun withApply() {
    // Particularly useful with initializing java classes without named parameters in constructors
    val person = Person().apply {
        name = "John Smythe"
        email = "john.smythe@bigcorp.com"
        age = 32
    }
}
