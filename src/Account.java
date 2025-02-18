/* abstract class declared with default previliges. It can only be accessed
 from within the package. This class has two abstract methods */

abstract class Account {
    /* balance within the account */
    float balance;

    /* Account No */
    private String accountNo;

    /* constructor to initialize balance and account no */
    Account(float b, String acc){
        balance = b;
        accountNo = acc;
    }
    /* getter method to access balance */
    float getBalance()
    {
        return balance;
    }

    /* setter method to modify balance */
    void setBalance(float b)
    {
        balance = b;
    }

    /* The methods are declared abstract so that the subclasses can code them according
    to their respective needs keeping their names in tact */

    abstract void debit(float amount);
    abstract void credit(float amount);

    /* getter method to access account no */
    String getAccountNo()
    {
        return accountNo;
    }

    /* setter method to modify balance */
    void setAccountNo(String acc)
    {
        accountNo = acc;
    }

    /* Print Account No and balance details */
    void display()
    {
        System.out.println("Account Number: "+ accountNo);
        System.out.println("Account Balance: "+balance);
    }

}
