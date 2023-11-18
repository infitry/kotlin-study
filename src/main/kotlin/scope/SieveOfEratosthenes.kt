package scope

class SieveOfEratosthenes {

    // Simple
    fun simple(): MutableList<Int> {
        var numbers = (2..100).toList()
        val primes = mutableListOf<Int>()
        while (numbers.isNotEmpty()) {
            val prime = numbers.first()
            primes.add(prime)
            numbers = numbers.filter { it % prime != 0 }
        }
        println(primes)

        return primes
    }

    // Expand a little further
    fun expandLittle(): List<Int> {
        val primes: Sequence<Int> = sequence {
            var numbers = generateSequence(2) { it + 1 }

            while (true) {
                val prime = numbers.first()
                println(prime)
                yield(prime)
                numbers = numbers.drop(1)
                    .filter { it % prime != 0 }
            }
        }

        val result = primes.take(10).toList()
        println(result)
        return result
    }

    // Optimization - Variable Capture
    fun optimization(): List<Int> {
        val primes: Sequence<Int> = sequence {
            var numbers = generateSequence(2) { it + 1 }

            var prime: Int
            while (true) {
                prime = numbers.first()
                yield(prime)
                numbers = numbers.drop(1)
                    .filter { it % prime != 0 }
            }
        }

        val result = primes.take(10).toList()
        println(result)
        return result
    }
}

fun main() {
    val sieveOfEratosthenes = SieveOfEratosthenes()
    sieveOfEratosthenes.simple()
    sieveOfEratosthenes.expandLittle()
    sieveOfEratosthenes.optimization()
}