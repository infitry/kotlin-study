package immutable

val name: String? = "Marton"
val surname: String = "Braun"

val fullName: String?
    get() = name?.let { "$it $surname" }

val fullName2: String? = name?.let { "$it $surname" }

fun main() {
    if (fullName != null) {
//        println(immutable.getFullName.length) 스마트 캐스트(자동 타입 캐스팅) 불가능 값을 사용하는 시점에 immutable.getName 에 따라 영향을 받음.
        println(fullName!!.length)
    }

    if (fullName2 != null) {
        println(fullName2.length)
    }
}