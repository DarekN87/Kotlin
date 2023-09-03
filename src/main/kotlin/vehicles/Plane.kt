package vehicles

open class Plane(val model: String) {

    init {
        println("blok init w samolocie")
        println(model)
    }

    constructor(model: String, year: Int) : this(model){
        println("secondery constraktor samolot")
    }
}