package vehicles

import java.time.Year

class Boeing(model:String, year: Int, var country: String): Plane(model, year) {

    init {
        println("blok inicjlizcacyjny klasy Boeing")
        println(model + " "+ year)
    }

}