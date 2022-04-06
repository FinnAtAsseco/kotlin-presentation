package dk.asseco.kotlin.presentation.language

/**
 * There are a lot of existing extension methods
 */
val str: String? = null
val isItNull = str.isNullOrEmpty() // <-- Won't give NullPointerException

/**
 * Creates new list with one more item.
 */
fun <T> List<T>.withNewItem(newItem: T): List<T> =
    this.toMutableList().apply { add(newItem) }.toList()

val list1 = listOf("a", "b", "c")
val list2 = list1.withNewItem("d")

/**
 * Get even numbers from a list of ints
 */
fun List<Int>.getEven(): List<Int> = this.filter { it % 2 == 0 }

val list3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val list4 = list3.getEven()

/**
 * Good for "enriching" a class (for example one generated from WSDL)
 */
