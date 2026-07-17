// RUN_PIPELINE_TILL: FRONTEND

interface Point { val x: Int; val y: Int }
data class Coordinate(override val x: Int, override val y: Int) : Point

class Globe {
    val position: Point
        field: Coordinate = Coordinate(1, 2)

    fun show() {
        val (a, b) = position // OK: narrowed to Coordinate inside Globe, componentN() resolves
        println("$a,$b")
    }
}

fun show(globe: Globe) {
    val (a, b) = <!COMPONENT_FUNCTION_MISSING, COMPONENT_FUNCTION_MISSING!>globe.position<!> // declared type is Point outside Globe, no componentN
    println("$a,$b")
}

/* GENERATED_FIR_TAGS: classDeclaration, data, destructuringDeclaration, explicitBackingField, functionDeclaration,
integerLiteral, interfaceDeclaration, localProperty, override, primaryConstructor, propertyDeclaration, smartcast,
stringLiteral */
