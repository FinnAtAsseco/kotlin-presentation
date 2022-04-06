package dk.asseco.kotlin.presentation.language

class ExtensiveApi {
    fun strings() {
        val str1 = "Hello World"
        val str2 = str1.substringAfter("Hello").trim()
    }

    fun collections() {
        val col = ArrayList<String>()
        val map = col.groupBy { it.length }
    }
}
