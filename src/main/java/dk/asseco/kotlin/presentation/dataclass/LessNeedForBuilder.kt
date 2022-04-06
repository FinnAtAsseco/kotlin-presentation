package dk.asseco.kotlin.presentation.dataclass

data class LessNeedForBuilder(
    val attrA: String,
    val attrB: String,
    val attrC: String,
    val attrD: String,
    val attrE: String,
    val attrF: String,
    val attrG: String
)

val x = LessNeedForBuilder(
    attrA = "A",
    attrB = "B",
    attrC = "C",
    attrD = "D",
    attrE = "E",
    attrF = "F",
    attrG = "G",
)

val y = x.copy(
    attrA = "Something else than A",
    attrD = "Something else than D"
)
