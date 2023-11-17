val list = listOf(1, 2, 3)

fun main() {
    // Do not try this
    if (list is MutableList) {
        list.add(4)
    }
    println(list)
}
