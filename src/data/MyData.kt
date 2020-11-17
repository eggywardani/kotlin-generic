package data

class MyData<T, U> (val firstData: T, val secondData:U) {
    fun printData(){
        println("Data is $firstData $secondData")
    }


    fun getData():T = firstData
    fun getSecond():U = secondData



}