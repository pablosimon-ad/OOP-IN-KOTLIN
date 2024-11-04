package chapter5

import chapter5.Animal.Canine
import chapter5.Animal.Feline

open class Animal {
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise() {
        println("The animal is making a noise")
    }

    open fun eat() {
        println("The animal is eating")
    }

    open fun roam() {
        println("The animal is roaming")
    }

    open fun sleep() {
        println("The animal is sleeping")
    }

    open class Feline : Animal() {
        override fun roam() {
            println("The feline is roaming")
        }
    }

    open class Canine : Animal() {
        override fun roam() {
            println("The canine is roaming")
        }
    }
}

class Hippo : Canine() {
    override val image = "hippo.jpg"
    override val food = "grass"
    override val habitat = "water"

    override fun makeNoise() {
        println("The hippo is making noise")
    }

    override fun eat() {
        println("The hippo is eating $food")
    }
}

class Wolf : Canine() {
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("The wolf is making noise")
    }

    override fun eat() {
        println("The wolf is eating $food")
    }
}

class Lion : Feline() {
    override val image = "lion.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("The lion is making noise")
    }

    override fun eat() {
        println("The lion is eating $food")
    }
}

class Cheetah : Feline() {
    override val image = "cheetah.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("The cheetah is making noise")
    }

    override fun eat() {
        println("The cheetah is eating $food")
    }
}

class Lynx : Feline() {
    override val image = "lynx.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("The lynx is making noise")
    }

    override fun eat() {
        println("The lynx is eating $food")
    }
}

class Fox : Canine() {
    override val image = "fox.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise() {
        println("The fox is making noise")
    }

    override fun eat() {
        println("The fox is eating $food")
    }
}

class vet {
    fun giveShot(animal: Animal){
        animal.makeNoise()
    }
}


