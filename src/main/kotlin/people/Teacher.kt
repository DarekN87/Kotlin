package people

class Teacher: Person {
    constructor(name: String, surname:String, age:Int):super(name, surname, age)

    init {
        "uzycie bloku init w Teacher"
    }
// bloki inicjalizujace uruchmiaja sie po primery constraktor a przed secendary constraktor
}