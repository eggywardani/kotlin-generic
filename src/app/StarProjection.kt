package app

fun displayLength(array: Array<*>){
    println("Total array : ${array.size}")

}


fun main() {
    val arrayInt : Array<Int> = arrayOf(1,2,3,4,5)
    val arrayString : Array<String> = arrayOf("Eggy", "Andika", "Wrdani")


    displayLength(arrayInt)
    displayLength(arrayString)
}


