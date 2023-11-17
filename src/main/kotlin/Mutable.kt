fun calculate(): Int {
    print("Calculating...")
    return 42
}

val fizz = calculate()
val buzz
    get() = calculate()

fun main() {
    println(fizz)
    println(fizz)
    println(buzz)
    println(buzz)
}