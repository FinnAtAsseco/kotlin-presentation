package dk.asseco.kotlin.presentation.dataclass

// This one like the Java class allows null
data class KotlinDataClass(
    var name: String? = null,
    var email: String? = null,
    var points: Int? = 0
)

// More constructors than java thanks to default values
var a = KotlinDataClass()
var b = KotlinDataClass("John Smythe")
var c = KotlinDataClass("John Smythe", "john.smythe@bigcorp.com")
var d = KotlinDataClass("John Smythe", "john.smythe@bigcorp.com", 42)

// named arguments allows us to specify arguments in any order
var e = KotlinDataClass(points = 42, email = "john.smythe@bigcorp.com", name = "John Smythe")

// Java records has some of this, but kotlin data classes can be used even if you are still stuck
// on jvm 8.
