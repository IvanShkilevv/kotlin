// RUN_PIPELINE_TILL: FRONTEND

fun testLocal() {
    val x: Number <!SYNTAX!>field = 0<!>
}

/* GENERATED_FIR_TAGS: functionDeclaration, localProperty, propertyDeclaration */
