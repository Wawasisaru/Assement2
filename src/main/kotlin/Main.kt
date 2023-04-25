fun main() {
    var deposit = CurrentAccount(706007173,"Nancy",500.80)
    println()
    deposit.details()
    multiples()
    student("Wawasi")




}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not.
fun student( name: String) {
   println(name[0])
    println(name[7])
    println(name.length)
}

//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name
open class CurrentAccount(var accountnumber: Int, var accountName: String, var balance: Double){
    fun deposit(amount: Double): Double {
        var deposit = 100.20
        var i = deposit ++
        return balance


    }
    fun withdraw(amount: Double){
        var withdraw = 300.20
        var i = withdraw --
        return

    }
    fun details(){
        println("$accountnumber with $balance is operated by $accountName")
    }
}
//Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal






//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
fun multiples (){
    for (num in 1..1000)
        if (num % 48 == 0){
            println("Bingo!")
        }else if(num%6 == 0) {
            println("Divisible by 6")
        }else if(num%8 == 0){
            println("Divisible by 8")
        }else{
            println(num)
        }

}

//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
fun security( password: String){
    for(pass in 8..16)
        if (pass < 8){
            return
        }
}