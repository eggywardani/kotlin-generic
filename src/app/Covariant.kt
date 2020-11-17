package app

class Covariant <out T>(val data: T){

    fun data():T{
        return data
    }


}


fun main() {
    val covariantString = Covariant("eggy")
    val covariantAny:Covariant<Any> = covariantString

    covariantAny.data()
}