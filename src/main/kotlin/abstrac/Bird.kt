package abstrac

abstract class Bird {

   var age: Int = 2

    fun displayAge(){
        println("Bird age is: $age")
    }

    abstract fun displaySoundMadeByBird()




}