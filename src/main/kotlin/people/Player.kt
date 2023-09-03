package people

class Player(name: String, surname:String, age: Int): Person(name,surname, age) {
    init {
        println("uzycie bloku init dla Player")
    }

}