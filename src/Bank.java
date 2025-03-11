/* class declared with default privileges so it can only be used within
the package */

public class Bank {

    /* customers are part of the bank and their details should not accessible to others.
    So Customer array is declared to be private. We have considered only three customers.
    Each element of the Customer array will hold an object of type Customer. */

    private Customer c[] = new Customer[3];

    /* constructor for the Bank class is declared */
    public Bank()
    {
        /* Customer objects created and put in the individual array elements.
        Constructor of the Customer class accepts three arguments: Customer name,
        Customer id and object of type Account. */

        c[0] = new Customer("Rahul","C001", new SavingAccount(12000,"A001"));
        c[1] = new Customer("Ram", "C002", new SavingAccount(12000,"A002"));
        c[2] = new Customer("Shyam", "C003", new CurrentAccount(12000,"A003",10000));
    }

    /* Banks can change their interest rate for all Saving Account holders by invoking this method */

    void changeInterestRate(float i)
    {
        /* SavingAccount class contains the attribute for interest rate. A setter method is created
        for setting the interest rate. This interest rate is applicable for all saving bank account
        holders. The static method 'setInterest' of the SavingAccount class is used to change the interest
        rate. */
        SavingAccount.setInterest(i);
    }

    /* main method declaration */
    public static void main(String[] args)
    {
        /* An object of Bank class is created which invokes the constructor of the Bank
        class. */
        Bank b = new Bank();

        /* Banks change its interest rate */
        b.changeInterestRate(6);

        /* Invokes its demo method- which deposits and makes withdrawals from the customer accounts */
        b.demo();

        /* bank deposits interest into its customer accounts */
        b.c[0].depositInterest();

        /* bank deposits interest into another customer accounts */
        b.c[1].depositInterest();
    }

    public void demo()
    {
        /* display method of the Customer object is called */
        c[0].display();

        /* customer deposits 1000 Rupees into his account */
        c[0].deposit(1000);

        /* customer withdraws 15000 Rupees into his account */
        c[0].withdrawl(15000);

        /* display method of another Customer object is called */
        c[1].display();

        /* customer deposits 2000 Rupees into his account */
        c[1].deposit(2000);

        /* customer withdraws 8000 Rupees into his account */
        c[1].withdrawl(8000);

        /* display method of the Customer object is called */
        c[2].display();

        /* customer deposits 1000 Rupees into his account */
        c[2].deposit(1000);

        /* customer withdraws 5000 Rupees into his account */
        c[2].withdrawl(5000);

        /* Customer again deposits 3000 Rupees into his account */
        c[2].deposit(3000);


    }
}
