# Banking Application

This is a Java-based Banking Application project. It demonstrates the use of object-oriented programming principles such as inheritance, polymorphism, and abstraction.

## Project Structure

The `src` folder contains the following Java files:

- **Account.java**: An abstract class representing a generic bank account.
- **Bank.java**: Manages bank operations and customers.
- **CurrentAccount.java**: A subclass extending `Account`, representing a current account.
- **Customer.java**: Represents a bank's customer.
- **SavingAccount.java**: A subclass extending `Account`, representing a savings account.

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


