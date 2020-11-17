package app

class TypeErasure <T>(param:T){
    private val data:T = param
    fun getData():T = data
}


fun main() {
    val data = TypeErasure<String>("Eggy")
    val dataString:String = data.getData()
    println(dataString)

    val data2:TypeErasure<Int> = data as TypeErasure<Int>
    val dataInt:Int = data2.getData()
    println(dataInt)


}