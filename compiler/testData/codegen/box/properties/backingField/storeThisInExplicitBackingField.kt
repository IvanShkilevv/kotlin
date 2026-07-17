// LANGUAGE: +ExplicitBackingFields

class Test {

    val self: Any
        field = this
}

fun box(): String {
    val test = Test()

    return if (test.self === test) {
        "OK"
    } else {
        "FAIL"
    }
}
