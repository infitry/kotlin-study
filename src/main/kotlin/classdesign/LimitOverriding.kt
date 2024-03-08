package classdesign

open class Parent {
    fun a() {}
    open fun b() {}
}

class Child: Parent() {
//    override fun a() {} // error
    override fun b() {}
}