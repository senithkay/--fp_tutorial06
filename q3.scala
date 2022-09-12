object q3 extends App{
    class Account(var balance: Double):
        def printFunds():Unit=println("Your account balance is rs."+balance);
        def transfer(amount:Double, account: Account):Unit={
            this.balance -= amount;
            account.balance += amount;
        }
    end Account

    val ac1 = new Account(100);
    val ac2 = new Account(20);
    ac1.transfer(50,ac2)
    ac1.printFunds()
    ac2.printFunds()
}