package vehicles

open class Vehicles {
    constructor( brand: String,  year: Int, color: String){
        println("secondary constructor vehicel")
    }

    init {
        println("you are actually using an initializer block for Vehicle")
    }

}