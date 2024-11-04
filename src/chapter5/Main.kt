package chapter5

fun main(args: Array<String>){
    val animals = arrayOf(Hippo(),Wolf(),Lion(),Cheetah(),Lynx(),Fox())
    val vet = vet()
    for (item in animals){
//        item.makeNoise()
//        item.roam()
//        item.eat()
        vet.giveShot(item)
    }
}