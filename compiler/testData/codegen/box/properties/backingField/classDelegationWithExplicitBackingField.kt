// LANGUAGE: +ExplicitBackingFields

interface Counter {
    val value: List<Int>
}

class Container(counter: Counter) : Counter by counter {
    val result: List<Int>
        field: MutableList<Int> = counter.value.toMutableList()

    fun increment() {
        result.add(2)
    }
}

fun box(): String {
    val container = Container(object : Counter {
        override val value = listOf(1)
    })

    container.increment()

    return if (container.result.size == 2) "OK" else "FAIL"
}
