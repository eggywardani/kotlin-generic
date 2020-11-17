fun main() {
    val data = arrayOf("1","2","3","4","5","6","8","8")
    for (i in data.indices){
        if (i == 0){
            println("data tidak ada")
        }else{
            println("${data[i]}")
        }
    }
}