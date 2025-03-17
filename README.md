# Banking Application

This is a Java-based Banking Application project. It demonstrates the use of object-oriented programming principles such as inheritance, polymorphism, and abstraction.

## Project Structure

The `src` folder contains the following Java files:

- **Account.java**: An abstract class representing a generic bank account.
- **Bank.java**: Manages bank operations and customers.
- **CurrentAccount.java**: A subclass extending `Account`, representing a current account.
- **Customer.java**: Represents a bank's customer.
- **SavingAccount.java**: A subclass extending `Account`, representing a savings account.

## Class Diagram

The following UML class diagram illustrates the structure of the Banking Application:

- **Account** (Abstract Class): Contains attributes like `accountNumber`, `balance`, and `customer`, with methods such as `deposit()`, `withdraw()`, and `getBalance()`.
- **SavingAccount** (Subclass): Inherits from `Account` and adds an `interestRate` attribute with an `addInterest()` method.
- **CurrentAccount** (Subclass): Inherits from `Account` and introduces an `overdraftLimit` attribute along with a `checkOverdraft()` method.
- **Customer**: Contains customer details (`name`, `address`, `phoneNumber`) and a method to retrieve details.
- **Bank**: Manages a collection of customers and accounts with methods like `createAccount()`, `getAccount()`, and `getCustomer()`.

The diagram also showcases inheritance arrows from `Account` to `SavingAccount` and `CurrentAccount`, and associations between `Bank`, `Customer`, and `Account`.

![image](https://github.com/user-attachments/assets/c2c3ed5f-57ae-43cb-8273-14ae223a8da0)


## Features

- **Abstraction**: The `Account` class serves as an abstract base class.
- **Inheritance**: `CurrentAccount` and `SavingAccount` inherit from `Account`.
- **Encapsulation**: Customer details and account data are encapsulated.
- **Polymorphism**: Supports different account behaviors (e.g., savings vs. current).

## Setup and Run

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   ```
2. **Navigate to the project directory:**
   ```bash
   cd BankingApplication
   ```
3. **Compile the source files:**
   ```bash
   javac src/*.java
   ```
4. **Run the application:**
   ```bash
   java src.Bank
   ```

## Future Enhancements

- Implement transaction handling (deposits, withdrawals).
- Add exception handling for invalid inputs.
- Introduce file-based persistence for data storage.

## Contributions

Feel free to fork this project, create feature branches, and submit pull requests.

---
Happy coding!




