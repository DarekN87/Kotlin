package vehicles
//class with constructor
class Motorcycle(var brand: String, var year: Int, var color: String) {

    fun drive(){
        println("Driving...")
    }    fun brandOfMotorcycle(): String{
        return "I ride a $brand motorcycle"
    }
}