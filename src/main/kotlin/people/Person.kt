package people

open  class Person(val name: String, val surname: String,  var age: Int  ) {

    init {
        println("you just created $name")
    }

    fun talk(){
        println("My name is $name $surname and I'm $age years old.")
    }


}