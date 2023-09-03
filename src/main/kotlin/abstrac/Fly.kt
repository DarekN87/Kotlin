package abstrac
 interface Fly {

     //implementujac interfejs musimy nadpisac niezaimplementowane metody oraz zminne z interfajsu do ktorych nie zostala przypisana wartosc w funkcji get
    val flightSpeed: Int
        get() = 20
    val flightLenght : Int
    fun startFlight()

    fun enadFlight(){
        println("it's over now")
    }
}