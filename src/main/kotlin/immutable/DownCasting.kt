package immutable

val list = listOf(1, 2, 3)

fun main() {
    // Do not try this
    if (list is MutableList) {
        list.add(4)
    }
    println(list)

    // Try this
    val mutableList = list.toMutableList()
    mutableList.add(4)
}
