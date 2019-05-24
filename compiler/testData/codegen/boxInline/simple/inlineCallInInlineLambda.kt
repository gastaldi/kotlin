inline fun f(g: (Int) -> Unit) = g(0)

inline fun h() = 0

fun box(): String {
    f { it + h() }
    return "OK"
}
