// RUN_PIPELINE_TILL: FRONTEND

interface Hexed {
    val hex: String
}

enum class Color(override val hex: String) : Hexed {
    RED("#F00") {
        fun brighten() = "#FF6666"
    }
}

class Palette {
    val primary: Hexed
        field = Color.RED

    fun test() {
        primary.<!UNRESOLVED_REFERENCE!>brighten<!>()
    }
}

/* GENERATED_FIR_TAGS: classDeclaration, enumDeclaration, enumEntry, explicitBackingField, functionDeclaration,
primaryConstructor, propertyDeclaration */
