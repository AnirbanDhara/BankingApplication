class CurrentAccount extends Account{
    /* borrowed amount, cannot be greater than the limit */
    float overdraftborrowed;

    /* Maximum credit limit */
    float overdraftlimit;

    /* Constructor to initialize the current account. Every current account holder
    will have a different overdraft limit. So while creating current account object
    we have to pass the limit as well */
    CurrentAccount(float b, String acno, float od)
    {
        super(b,acno);
        overdraftlimit = od;
    }

    /* limits may change over time so an option is provided to change the limit */
    void setOverdraft(float o)
    {
        overdraftlimit = o;
    }

    /* credit method is used to deposit the amount in the current account. If the customer
    has borrowed some amount from the bank, then first borrowed amount is returned to the
    bank and the rest is added to the balance */
    public void credit(float amount)
    {
        System.out.println("Amount to be credited: "+amount);
        System.out.println("Old Balance: "+balance);
        System.out.println("Overdraft Borrowed: "+overdraftborrowed);

    /* checks whether amount to be deposited is greater than overdraftborrowed, deducts it
    by overdraftborrowed thus making the overdraftborrowed nil and add the rest amount in balance.
    Otherwise the overdraftborrowed is reduced by the amount making no changes to the
    balance */
        if(amount > overdraftborrowed)
        {
            amount = amount - overdraftborrowed;
            overdraftborrowed = 0;
            balance = balance + amount;
        }
        else if(amount < overdraftborrowed){
            overdraftborrowed = overdraftborrowed - amount;
        }
        System.out.println("New Overdraft Borrowed: "+overdraftborrowed);
        System.out.println("New Balance: "+balance);
    }

    /*deducts the amount from the balance. If amount to be deducted is less than balance;
    the amount is deducted from balance. But, if amount is grater than balance but less
    than the limit, then the shortfall will be fulfilled by the by setting the overdraftborrowed
    for the customer. Hence overdraftborrowed is set to shortfall(amount-balance) and balance
    will be nil. If amount is greater than balance as well as the ODlimit then the request is
    denied */

    public void debit(float amount)
    {
        System.out.println("Amount to be debited: "+amount);
        System.out.println("Old Balance: "+balance);
        if(amount <= balance)
            balance = balance -amount;
        else if((amount > balance) && (amount < (balance + overdraftlimit)))
        {
            overdraftborrowed = amount - balance;
            balance = 0;
            System.out.println("Overdraft Borrowed: "+ overdraftborrowed);
        }
        else
            System.out.println("Request Denied");
            System.out.println("New Balance: "+balance);
            System.out.println("Overdraft Borrowed: "+overdraftborrowed);
    }

    public void display()
    {
        super.display();
        System.out.println("Overdraft limit: "+overdraftlimit);
    }

    public String toString()
    {
        return "Current Account No: "+getAccountNo()+ "Balance: "+balance+ "Overdraft limit: "+overdraftlimit;
    }

}
