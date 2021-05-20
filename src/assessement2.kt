fun main(){
    theCars(listOf(Car("Prado","nissan","red"),
        Car("Benz","Toyota","blue"),
        Car("BMW","R4","Pink")))
    println(myName("Sharon"))
    var currentaccount=CurrentAccount(45272,"PayPal",10000.00)
    currentaccount.deposit(5000.00)
    currentaccount.withdraw(8000.00)
    currentaccount.details()
    var savingsaccount=SavingAccount(2,4301,"Pesapap",500.00)
    savingsaccount.withdraw()

}
data class Car(var make:String,var model:String,var color:String)
fun theCars(cars:List<Car>){
    var red= mutableListOf<Car>()
    var blue= mutableListOf<Car>()
    var other= mutableListOf<Car>()
    for (items in cars){
    when(items.color){
        "red"->println(red.plus(items))
        "blue"->println(blue.plus(items))
        else->println(other.plus(items))

    }
}
}
fun myName(name:String):Int{
    var nameLength=name.length
    return nameLength
}
open class CurrentAccount(var accountNumber:Int,var accountName:String,var balance:Double){
fun deposit(amount:Double){
    var increment=balance+amount
    println(increment)
}
    fun withdraw(amount:Double){
        var decrement=balance-amount
        println(decrement)
    }
    fun details(){
      println("Account number ${accountNumber} with balance ${balance} is operated by ${accountName}")
    }
}
class SavingAccount(var withdrawals:Int,accountNumber:Int,accountName: String,balance:Double):CurrentAccount(accountNumber, accountName, balance){
    fun withdraw(){
    if(withdrawals<4){
        withdrawals++
        println(withdrawals)

    }

    }

}