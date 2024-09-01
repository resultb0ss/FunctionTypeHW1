fun main() {



    println(factroial(3))

}

fun factroial(n: Int): Int {
    require(n >= 0)
    return if (n<=1){1}
    else {
        n * factroial(n - 1)

    }
}