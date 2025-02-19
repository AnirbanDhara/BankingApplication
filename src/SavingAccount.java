class SavingAccount extends Account{
    /* Interest rate is common for all Saving Accounts. So this field is declared as static */

    static float interest = 4;

    /* Constructor declared to initialize both the account number and balance by calling the
    Acccount (super class) constructor using super keyword */

    SavingAccount(float b, String acno)
    {
        super(b,acno);
    }

    /* explicit default constructor */

    SavingAccount()
    {
        super(0, "");
    }

    /* Static method is created to charge the interest rate. If the bank wishes to change the interest
    rate, it can do so without creating an instance of SavingAccount class */

    static void setInterest(float i)
    {
        interest = i;
    }

    /* display method to print account no, balance and interest rate. Yhe super class display method
    already prints the account no and balance so it is invoked using the super keyword */

    public void display()
    {
        super.display();
        System.out.println("Interest rate: "+interest);
    }

    /* Account is credit with amount. The balance increases by the amount passed in this method */

    public void credit(float amount)
    {
        System.out.println("Amount to be credited: "+amount);
        System.out.println("Old balance: "+balance);
        balance = balance + amount;
        System.out.println("New balance: "+balance);
    }

    /* Account is debited with amount. */

    public void debit(float amount)
    {
        System.out.println("Amount to be debited: "+amount);
        System.out.println("Old balance: "+balance);

    /* If the amount to be withdrawn is less than the balance, it is decreased by
    the amount otherwise the request is denied */

        if(amount < balance)
        {
            balance = balance - amount;
            System.out.println("New balance: "+balance);
        }
        else

            System.out.println("Request Denied");

    }

    /* SavingAccount earn interest on the balance. This method when invoked will
    calculate the interest on the balance and add it to the balance */

    public void creditInterest()
    {
        float temp = balance * interest / 100;
        System.out.println("Interest paid: "+temp);
        balance = balance + temp;
        System.out.println("New balance: "+balance);
    }

    /* toString method hasbeen overridden to return a String representation of the
    SavingAccount object */

    public String toString()
    {
      return "Saving Account No: "+getAccountNo()+ "Balance: "+balance;
    }

}
