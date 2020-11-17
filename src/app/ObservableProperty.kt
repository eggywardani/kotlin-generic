package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty


class LogObservableProperty<T>(param:T):ObservableProperty<T>(param){
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before Change ${property.name}  from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After Change ${property.name}  from $oldValue to $newValue")

    }


}

class Car(brand:String, year:Int){

    var brand:String by LogObservableProperty(brand)
    var year:Int by LogObservableProperty(year)
    var owner:String by Delegates.notNull<String>()
    var desc:String by Delegates.vetoable(""){property, oldValue, newValue ->
        println("Before Change ${property.name}  from $oldValue to $newValue")

        true
    }
    
    var other:String by Delegates.observable(""){property, oldValue, newValue ->
        println("After Change ${property.name}  from $oldValue to $newValue")
    }

}


fun main() {
    var car = Car("Toyota", 2019)

    car.year = 2020
    println(car.brand)
    println(car.year)

    car.owner="Eggy"
    println(car.owner)

    car.desc = "Desk"
    car.other = "Other"

    println(car.desc)
    println(car.other)



}