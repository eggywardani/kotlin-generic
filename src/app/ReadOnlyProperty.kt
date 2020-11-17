package app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

class LogReadOnlyProperty(val data:String):ReadOnlyProperty<Any, String>{
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Acces Property ${property.name} with value $data")
        return data.toUpperCase()
    }

}


class NameWithLog(param:String){
    val name:String by LogReadOnlyProperty(param)

}


fun main() {
    val nameWithLog = NameWithLog("Eggy")
    println(nameWithLog.name)
    println(nameWithLog.name)

}