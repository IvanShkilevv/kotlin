// RUN_PIPELINE_TILL: BACKEND

class Test {

    val value: Any
        field = run {
            class Local(val x: Int)
            Local(42)
        }
}

/* GENERATED_FIR_TAGS: classDeclaration, explicitBackingField, integerLiteral, lambdaLiteral, localClass,
primaryConstructor, propertyDeclaration */
