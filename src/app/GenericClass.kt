package app

import data.MyData

fun main() {
    val myDataString  = MyData<String, Int>("Eggy", 100)
    myDataString.printData()

    val myDataInt = MyData(10,"Rina")
    myDataInt.printData()

}