package readability

data class Person(val isAdult: Boolean)

class View {
    fun showPerson(person: Person) = println("TEST $person")
    fun hideProgressWithSuccess() = null
    fun showError() = println("error!")
    fun hideProgress() = println("hide progress")
}

fun getPerson(i: Int): Person? {
    if (i == 1) {
        return null
    }
    return Person(true)
}

fun main() {
    val view = View()
    val person = getPerson(0)
    
    person?.takeIf { it.isAdult }
        ?.let {
            view.showPerson(it)
            view.hideProgressWithSuccess()
        } ?: run {
            view.showError()
            view.hideProgress()
        }
}

