object q4 extends App{
    class Account(var balance: Double):
        def printFunds():Unit=println("Your account balance is rs."+balance);
        def addMoney(money: Double):Unit=this.balance ={this.balance+ money};
        def getBalance():Double=balance;
    end Account

    class Bank(var accounts: Account*):
        def addAccount(ac: Account):Unit= {ac +: this.accounts;}
        def totalBalance():Double={
            var t:Double = 0;
            for(i<-this.accounts){
                t += i.getBalance();
            }
            println(t);
            return t;
        }

        var interest = ()
    end Bank

    var b = new Bank(new Account(10), new Account(20), new Account(-5), new Account(30));
    b.totalBalance();
}