import java.util.Scanner;

//  Abstraction + Encapsulation 
abstract class BankAccount {
    private int pin = 1234;     
    private double balance = 1000;

    public boolean checkPin(int enteredPin) {
        return pin == enteredPin;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient balance!");
    }

    abstract void message();  
}

//  Inheritance + Polymorphism 
class ATM extends BankAccount {
    @Override
    void message() {  
        System.out.println("Welcome to Simple ATM System");
    }
}

//  Main class 
public class MyATMProject {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        atm.message();  

        //  3 PIN attempt system 
        int tries = 0;
        boolean loggedIn = false;

        while (tries < 3) {
            System.out.print("Enter PIN: ");
            int p = sc.nextInt();

            if (atm.checkPin(p)) {
                loggedIn = true;
                break;
            } else {
                tries++;
                System.out.println("Wrong PIN! Tries left: " + (3 - tries));
            }
        }

        if (loggedIn) {
            //  Menu Loop 
            while (true) {
                System.out.println("\n1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");
                System.out.print("Choose option: ");

                int ch = sc.nextInt();

                if (ch == 1) {
                    System.out.println("Balance = " + atm.getBalance());
                } else if (ch == 2) {
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    atm.deposit(amt);
                    System.out.println("Deposited");
                } else if (ch == 3) {
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    atm.withdraw(amt);
                } else if (ch == 4) {
                    System.out.println("Thank you! Exiting...");
                    break;
                } else {
                    System.out.println("Invalid choice");
                }
            }
        } else {
            System.out.println("Card blocked! Too many wrong attempts.");
        }

        sc.close();
    }
}