fun main(args: Array<String>) {

    println(addTwoNumb(2, 3))
    println(addTwoNumber(2, 3))
    println(addTwoNum(2, 3))
    println(addTwoNum(2))
    println(addTwoNum())

    //CREATING OBJECT
    var car1 = Car()
    val car2 = Car()
    println(car1.color)
    println(car2.color)
    car1.color = "Black"
    val car3 = Car()
    //kolor jest przypisany do konkretnego obiektu i zmina koloru w stworzonym obiekcie nie ma wplywu na jego zmine w innych obiektach
    println(car1.color)
    println(car2.color)
    println(car3.color)
    car3.color = "Blu"
    //val przy stworoznym obiekcie uniemozliwa przypusanie nowego obiektu do zminnej(stalej) jednak pozwala zmiiac atrybuty wewnatrz tego obiektu
    println(car3.color)
    //car3.engineCapacity = "4.0" - nie moznemy zminic pojemnosci bo jest ustawiona jako stala
    val moto1 = Motorcycle("BMW", 2021, "Blue")
    val moto2 = Motorcycle("Kawasaki", 2022, "Green")
    println(moto1.brand)
    moto2.drive()
    println(moto1.brandOfMotorcycle())
}

fun addTwoNumber(x: Int, y: Int): Int {
    return x + y
}

fun addTwoNumb(x: Int, y: Int): Int = x + y
fun addTwoNum(x: Int = 2, y: Int = 3) = x + y


