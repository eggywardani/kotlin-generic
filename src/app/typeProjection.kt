package app

class Container<T>(var data:T)

fun copyContainer(from:Container<out Any>, to:Container<in Any>){

    to.data = from.data
}

fun main() {
    val c1 = Container("Eggy")
    val c2:Container<Any> = Container("Lisa")


    copyContainer(c1, c2)

    println(c1.data)
    println(c2.data)

}