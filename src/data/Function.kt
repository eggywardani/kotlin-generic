package data

class Function(val name:String) {

    fun <T> sayHello(param:T){
        println("Hallo $param, My Name is $name")
    }



}