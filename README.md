# OIBSIP Java Development - Task 3

# 🏦 ATM Interface

## 📌 Project Title

**ATM Interface**

## 🎯 Objective

The objective of this project is to develop a console-based **ATM Interface** using Java.

The application simulates basic ATM operations such as creating an account, logging in, checking balance, withdrawing money, depositing money, transferring money between accounts, and viewing transaction history.

This project was developed as part of the **Oasis Infobyte (OIBSIP) Java Development Internship – Task 3**.

---

## 📝 Project Description

The ATM Interface is a menu-driven Java application that provides basic banking operations through the console.

Users can create a new account or log in to an existing account using their **User ID and PIN**.

After successful login, the user can access different ATM operations. The system also maintains the user's transaction history and allows money transfers between registered accounts.

The application provides a maximum of **3 login attempts**. If incorrect credentials are entered three times, access is denied.

---

## ✨ Features

### 👤 Account Management

* Create a new account
* Enter a unique User ID
* Create a 4-digit PIN
* New account starts with a balance of 0
* Prevents duplicate User IDs

### 🔐 Login System

* Login using User ID and PIN
* Maximum 3 login attempts
* Displays remaining attempts
* Denies access after 3 incorrect attempts

### 💰 ATM Operations

* Check account balance
* Withdraw money
* Deposit money
* Transfer money to another account
* View transaction history
* Logout from the ATM

### 💸 Withdrawal

* Accepts withdrawal amount from the user
* Checks whether the amount is valid
* Checks for sufficient balance
* Updates the account balance
* Records the withdrawal in transaction history

### 💵 Deposit

* Accepts deposit amount
* Validates the amount
* Updates the account balance
* Records the deposit in transaction history

### 🔄 Money Transfer

* Transfers money using the receiver's User ID
* Checks whether the receiver account exists
* Prevents transferring money to the same account
* Checks sender's balance
* Updates both sender and receiver balances
* Records the transfer in transaction history

### 📜 Transaction History

* Stores transactions using `ArrayList`
* Displays previous withdrawals, deposits, and transfers
* Displays a message when there are no transactions

---

## 🛠️ Technologies Used

* **Java**
* **Scanner**
* **Random/Java Collections concepts**
* **Array**
* **ArrayList**
* **Classes and Objects**
* **Constructors**
* **Encapsulation basics**
* **Loops**
* **Switch-Case**
* **If-Else Statements**
* **String methods**
* **VS Code**
* **Git & GitHub**

---

## 🏗️ Project Structure

The project consists of three main classes:

### 1. `ATM`

The `ATM` class handles the main ATM operations.

It contains methods such as:

```text
Menu()
TransactionHistory()
WithDraw()
Deposit()
Transfer()
checkBalance()
```

### 2. `Account`

The `Account` class manages user account information.

It stores:

```text
User ID
PIN
Balance
Transaction History
```

It also handles:

```text
Account_()
login()
```

### 3. `ATMProject`

The `ATMProject` class contains the `main()` method and starts the application.

It provides the main menu:

```text
1. Create A New Account
2. Log In in Existing Account
3. Exit
```

---

## 🔐 Login System

The application provides a secure login mechanism with a maximum of three attempts.

Example:

```text
Enter your UserId : Vrushali@18
Enter your PIN : 1234

Login Successfully
Welcome Vrushali@18
```

If incorrect credentials are entered:

```text
Invalid Credentials!
Attempts Remaining : 2
```

After three unsuccessful attempts:

```text
Too many incorrect attempts!
Access Denied...
```

---

## 🏦 ATM Menu

After successful login, the following menu is displayed:

```text
================================
          ATM MENU
================================
1. Transaction History
2. Withdraw
3. Deposit
4. Transfer
5. Check Balance
6. Quit
```

---

## 💰 Withdrawal

The user can withdraw money from their account.

The program checks:

1. Whether the entered amount is greater than 0.
2. Whether sufficient balance is available.
3. Updates the balance after a successful withdrawal.
4. Adds the transaction to transaction history.

Example:

```text
Enter the Amount To Withdraw :
5000

Withdrawal Successful!
Remaining Balance = 45000
```

---

## 💵 Deposit

The user can deposit money into their account.

The program checks whether the entered amount is valid and then updates the account balance.

Example:

```text
Enter the Amount To Deposit
10000

Deposit Successful!
Current Balance = 55000
```

---

## 🔄 Money Transfer

The user can transfer money to another registered account using the receiver's User ID.

The program checks:

* Whether the receiver exists
* Whether the receiver is not the sender
* Whether the transfer amount is valid
* Whether the sender has sufficient balance

Example:

```text
Enter Receiver User ID : Sanyukti@02
Enter Amount To Transfer : 5000

Transfer Successful!
Amount Transferred = 5000
Remaining Balance = 45000
```

---

## 📜 Transaction History

The application stores transactions using `ArrayList`.

Transactions include:

```text
Withdraw : 5000
Deposit : 10000
Transfer To Sanyukti@02 : 5000
```

If there are no transactions:

```text
----- Transaction History -----
No Transactions Yet.
-------------------------------
```

---

## 👤 Default Accounts

The project contains two default accounts for testing.

| User ID     |  PIN | Initial Balance |
| ----------- | ---: | --------------: |
| Vrushali@18 | 1234 |           50000 |
| Sanyukti@02 | 1235 |           50000 |

> These are demo accounts created in the source code for testing purposes.

---

## 🆕 Create New Account

The user can create a new account by selecting:

```text
1. Create A New Account
```

The program asks for:

```text
Enter User Id :
Enter PIN :
```

The User ID must be unique and the PIN must contain exactly 4 digits.

A newly created account starts with:

```text
Balance = 0
```

---

## ▶️ How to Run

### Step 1: Install Java

Install the Java JDK on your computer.

### Step 2: Open the Project

Open the project in **VS Code** or another Java IDE.

### Step 3: Compile the Program

Compile the Java source file:

```text
ATMProject.java
```

### Step 4: Run the Program

Run the `ATMProject` class.

### Step 5: Use the ATM

Choose an option from the main menu and follow the instructions displayed on the console.

---

## 📂 Repository Structure

```text
OIBSIP_Java_Task3
│
├── ATMProject.java
└── README.md
```

If the classes are stored in separate files, the structure can be:

```text
OIBSIP_Java_Task3
│
├── ATM.java
├── Account.java
├── ATMProject.java
└── README.md
```

---

## 📚 Java Concepts Learned

Through this project, I practiced:

* Classes and Objects
* Constructors
* Arrays
* ArrayList
* Scanner
* Methods
* `if-else`
* `switch-case`
* `do-while` loops
* `while` loops
* String comparison using `equals()`
* User input handling
* Basic OOP concepts
* Data management
* Transaction handling
* Problem-solving and logical thinking

---

## ✅ Outcome

Successfully developed a console-based **ATM Interface** using Java.

The project implements account creation, user authentication, balance checking, withdrawal, deposit, money transfer, transaction history, and logout functionality.

This project helped improve my understanding of **Java OOP concepts, arrays, ArrayList, loops, conditional statements, user input handling, and real-world problem-solving**.

---

## 👩‍💻 Author

**Vrushali Janbhare**

## 🏢 Internship

**Oasis Infobyte (OIBSIP)**

**Domain:** Java Development

**Task:** Task 3 – ATM Interface
