// RUN_PIPELINE_TILL: FRONTEND

fun interface Action {
    fun run(): Int
}

class Test {

    val goodAction: Any
        field = Action { 42 }

    val badAction: Action
        <!REDUNDANT_EXPLICIT_BACKING_FIELD!>field<!> = { 41 }
}

/* GENERATED_FIR_TAGS: classDeclaration, explicitBackingField, funInterface, functionDeclaration, integerLiteral,
interfaceDeclaration, lambdaLiteral, propertyDeclaration */
