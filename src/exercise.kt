fun main(){
    var cars = Car(make: "Subaru", model: "Forester", color: "Red"),
    Car(make: "V8", model: "Isuzu", color: "Blue")
    Car(make: "Benz", model: "Toyota", color: "Black")
    cars.colors()
    letter("Moldel")
    var account = SavingsAccount(4531,"Branden", 453724)
    account.deposit()
    account.balance
    account.accountName
    var savings = SavingsAccount(34235, "Gerald", 343213)
    account.balance
}



data class Car (val make: String, val model: String, val color:String){
    fun colors(){
        when(color){
            "Red" ->(println(listOf(make,color)))
            "Blue" ->(println(listOf(color, make)))
            else ->(println(listOf(make,model,color)))
        }
    }
}
fun letter(x: String) {

}

class SavingsAccount(var accountNumber: Int, var accountName: String, var balance: Int){
    fun deposit(){
        for (i in deposit) {
            i++
        }
    }
}
fun withdraw(){
    for (x in withdraw){
        x--
    }
}
fun details(){
    println($accountNumber "with balance"$ balance" is operated by z")
}

class SavingsAccount(withdrawals: Int): Boolean{
    if (withdraw < 4){
        return true
        for (v in withdraw)
            ++
    }
}
