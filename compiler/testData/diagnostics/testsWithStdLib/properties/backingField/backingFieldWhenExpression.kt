// RUN_PIPELINE_TILL: FRONTEND

sealed interface Expr

data object One : Expr
data object Two : Expr

class Test(expr: Expr) {

    val value: Number
        field: Int = when (expr) {
            One -> 1
            Two -> 2
        }
}

/* GENERATED_FIR_TAGS: classDeclaration, data, equalityExpression, explicitBackingField, integerLiteral,
interfaceDeclaration, objectDeclaration, primaryConstructor, propertyDeclaration, sealed, smartcast, whenExpression,
whenWithSubject */
