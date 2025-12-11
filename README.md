# SimpleATM-Java
Simple ATM project in Java demonstrating OOP principles


A simple **console-based ATM program** written in Java demonstrating **Object-Oriented Programming (OOP) concepts** such as Encapsulation, Abstraction, Inheritance, and Polymorphism.

---

## Features

- **Login with PIN** (3 attempts max)  
- **Check Account Balance**  
- **Deposit Money**  
- **Withdraw Money**  
- **Exit Program**  
- **Simple console-based interface** — easy to use  

---

## OOP Concepts Demonstrated

- **Encapsulation**: PIN and balance are private and accessed only via methods.  
- **Abstraction**: Abstract `BankAccount` class with abstract method `message()`.  
- **Inheritance**: `ATM` class extends `BankAccount`.  
- **Polymorphism**: `message()` method overridden in `ATM` class.

---

## How to Run

1. Clone the repository:
```bash
git clone https://github.com/fasihminai/SimpleATM-Java.git


Usage

Enter your PIN (default: 1234).

If wrong PIN is entered 3 times, the program will block access.

Choose from the menu to check balance, deposit, withdraw, or exit.



Future Improvements

Multiple account support with transfer between accounts

Input validation for negative numbers

Hiding PIN input while typing

GUI version for better user experience
