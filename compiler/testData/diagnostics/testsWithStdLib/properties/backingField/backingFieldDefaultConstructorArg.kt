// RUN_PIPELINE_TILL: FRONTEND

class Box(val value: Int = DEFAULT) {

    companion object {
        const val DEFAULT = 42
    }

    val x: Number
        field = value
}

/* GENERATED_FIR_TAGS: classDeclaration, companionObject, const, explicitBackingField, integerLiteral, objectDeclaration,
primaryConstructor, propertyDeclaration */
