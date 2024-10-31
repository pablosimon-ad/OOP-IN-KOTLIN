package chapter4

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args: Array<String>) {
val myDog = Dog("Fido",70,"Mixed")
    myDog.bark()
    myDog.weight = 75
    println("Weight in kgs is ${myDog.weightIntKgs}")
    myDog.weight = -2
    println("Weight is ${myDog.weight}")
    myDog.activities = arrayOf("Walks", "Fetching balls", "Frisbee")
    for (item in myDog.activities){
        println("My dog enjoys $item")
    }
    val dogs = arrayOf(
        Dog("Kelpie", 20, "Westie"),
        Dog("Charlie", 35, "Labrador")
    )
    dogs[0].bark()
    dogs[0].weight = 15
    println("Weight for ${dogs[0].name} is ${dogs[0].weight}")

}