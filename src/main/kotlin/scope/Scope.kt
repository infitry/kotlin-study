package scope

data class User(
    val name: String,
    val age: String
)

fun main() {
    val users = listOf(User("1", "19"), User("2", "20"))

    // Bad case
    var user: User
    for (i in users.indices) {
        user = users[i]
        println("User at $i is $user")
    }

    // Good case
    for ((i, user2) in users.withIndex()) {
        println("User at $i is $user2")
    }
}