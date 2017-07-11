package i_introduction._3_Default_Arguments

import syntax.casts.foo
import util.TODO
import util.doc2

fun todoTask3(): Nothing = TODO(
    """
        Task 3.
        Several overloaded 'foo' functions in the class 'JavaCode3' can be replaced with one function in Kotlin.
        Change the declaration of the function 'foo' in a way that makes the code using 'foo' compile.
        You have to add 'foo' parameters and implement its body.
        Uncomment the commented code and make it compile.
    """,
    documentation = doc2(),
    references = { name: String -> JavaCode3().foo(name); foo(name) })

fun foo2(name: String, number: Int = 42, toUpperCase: Boolean = false): String {
    if (toUpperCase)
        return name.toUpperCase() + number.toString()
    else
        return name + number.toString()
}

fun task3(): String {
    return (foo2("a") +
            foo2("b", number = 1) +
            foo2("c", toUpperCase = true) +
            foo2(name = "d", number = 2, toUpperCase = true))
}