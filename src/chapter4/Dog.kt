package chapter4

import java.util.*

class Dog (val name: String, weightParam: Int, breedParam: String){
    init{
        print("Dog $name has been created.")
    }
    var activities = arrayOf("Walks")
    val breed = breedParam.uppercase(Locale.getDefault())
    init{
        println("The breed is $breed.")
    }
    var weight = weightParam
        set(value){
            if(value>0) field=value
        }
    val weightIntKgs: Double
        get() = weight / 2.2

    fun bark(){
        println(if(weight<20)"woof!" else "WOOF!")
    }
}