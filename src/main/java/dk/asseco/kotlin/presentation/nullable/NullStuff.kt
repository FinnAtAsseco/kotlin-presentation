package dk.asseco.kotlin.presentation.nullable

data class Name(
    val firstName: String? = null,
    val lastName: String? = null
)

data class KotlinDataClassWithNulls(
    val name: Name? = null,
    val email: String? = null,
    val points: Int = 0
)

data class KotlinDataClass(
    val name: Name,
    val email: String? = null,
    val points: Int = 0
)

// var a = KotlinDataClass() // <-- Not allowed since name has no default value and thus is mandatory
var b = KotlinDataClass(Name("John", "Smythe"))
var c = KotlinDataClass(Name("John", "Smythe"), "john.smythe@bigcorp.com")
var d = KotlinDataClass(Name("John", "Smythe"), "john.smythe@bigcorp.com", 42)

class NullSafety {
    val a: String? = null
    val b: String = a ?: "Default value" // forced to handle potential null

    fun printIt(str: String) {
        println("called with $str")
    }

    fun forcingNullChecks() {
        if (a != null) { // a is smart-cast to non-nullable "String"
            printIt(a)
        }

        printIt(a ?: "It was null")

        printIt(b)
    }

    fun safeCalling() {
        var a: KotlinDataClass? = null

        println(a?.name?.firstName ?: "it was null")
        println("His name is ${a?.name?.firstName}")
    }
}
