class Customer {
    //customer name
    String custName;

    //customer id
    String custId;

    /* every customer of the bank is assigned am Account which is its private attribute.
    So an instance variable of type Account is defined here. A customer can either have a
    saving account or current account. That is why we have added an attribute of type
    Account in this class and not SavingAccount or CurrentAccount. Account reference
    variable can refer to objects of its subclass: SavingAccount and CurrentAccount. So
    whatever account the customer wishes to open, its object can be saved into this instance
    variable of type Account */

    private Account account;

    /* constructor to initialize the customer attributes */
    Customer(String custName, String custId, Account account)
    {
        this.custName = custName;
        this.custId = custId;
        this.account = account;
    }

    /* deposit method declared to add amount to the balance. Here we have to call the
    appropriate method according to the type of the account. So first we check what is the type
    of account held by the customer using the instanceof keyword and based on that we call credit
    method of the respective classes. */

    public void deposit(float amt)
    {
        if(account instanceof SavingAccount)

    /* credit method belongs to the SavingAccount class or the CurrentAccount class and not the
    Account class. So if the method is invoked as account.credit(amt), the compiler will not compile
    the program. The reason is that the compiler looks for credit method in the Account class (as the
    type of account reference variable is Account) which is not there. The account variable is casted
    into SavingAccount or CurrentAccount and then the credit method is invoked. The cast is possible
    as the classes are subclasses of the Account class. The account reference variable will actually
    hold objects of either SavingAccount or CurrentAccount class. */
            ((SavingAccount)account).credit(amt);

            else if(account instanceof CurrentAccount)
            ((CurrentAccount)account).credit(amt);
    }

    /* Only SavingAccount to be credited with interest on balances */
    void depositInterest()
    {
        System.out.println("Depositing Interest in : "+custId);

        if(account instanceof SavingAccount)
            ((SavingAccount)account).creditInterest();
    }

    /* withdrawal method declared to deduct amount from the balance. Here we have to call
    the appropriate method according to the type of the account. So first we check what is
    the type of account held by the customer using the instanceof keyword and based on that
    we call the debit method of the respective classes. */

    public void withdrawl(float amt)
    {
        if(account instanceof SavingAccount)
            ((SavingAccount)account).debit(amt);
        else if(account instanceof CurrentAccount)
            ((CurrentAccount)account).debit(amt);
    }

    /* display the customer details along with the account held by the customer */

    public void display()
    {
        System.out.println("Customer Name: "+custName);
        System.out.println("Customer Id: "+custId);
        account.display();
        System.out.println(account);
    }
}
