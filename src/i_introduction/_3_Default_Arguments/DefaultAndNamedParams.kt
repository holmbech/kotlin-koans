package i_introduction._3_Default_Arguments

import util.TODO
import util.doc2

fun todoTask3(): Nothing = TODO(
        """
        Task 3.
        Several overloads of 'JavaCode3.foo()' can be replaced with one function in Kotlin.
        Change the declaration of the function 'foo' in a way that makes the code using 'foo' compile.
        You have to add parameters and replace 'todoTask3()' with a real body.
        Uncomment the commented code and make it compile.
    """,
        documentation = doc2(),
        references = { name: String -> JavaCode3().foo(name); foo(name, 1, true) })

fun foo(name: String, number: Int = 42, toUpperCase: Boolean): String {
    if (toUpperCase) {
        return name.toUpperCase() + number
    }
    else {
        return name + number
    }
}

fun task3(): String {
//    todoTask3()
    return (foo("a", 42, false) +
            foo("b", number = 1, toUpperCase = false) +
            foo("c", toUpperCase = true) +
            foo(name = "d", number = 2, toUpperCase = true))
}
