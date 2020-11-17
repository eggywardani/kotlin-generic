package app

import kotlin.properties.ReadOnlyProperty
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class StringLogReadWriteOnlyProperty(var data:String):ReadWriteProperty<Any, String>{
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Get property ${property.name}")
        return data
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: String) {
        println("Set property ${property.name} from $data to $value")
        data = value
    }


}


class Person(param:String){
    var name:String by StringLogReadWriteOnlyProperty(param)
}

fun main() {
    val person = Person("Eggy")
    println(person.name)
    person.name = "Lisa"
    println(person.name)



}