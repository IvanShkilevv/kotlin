// RUN_PIPELINE_TILL: FRONTEND

class Test {
    val a: Number
        field: Int = <!UNINITIALIZED_VARIABLE!>b<!>

    val b: Number
        field: Int = a
}
/* GENERATED_FIR_TAGS: classDeclaration, explicitBackingField, propertyDeclaration */
