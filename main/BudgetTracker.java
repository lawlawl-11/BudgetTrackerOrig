package main;

import java.util.Scanner;

import components.Account;
import components.Expenses;
import components.CheckingExpenses;
import components.UserAccounts;

public class BudgetTracker {
    private static final Scanner sc = new Scanner(System.in);
    private static final UserAccounts user = new UserAccounts();
    private static final CheckingExpenses expenses = new CheckingExpenses();

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n=== BUDGET TRACKER SYSTEM ===");
            System.out.println("[1] Add Account"); 
            System.out.println("[2] Open Account");
            System.out.println("[3] Add Expenses");
            System.out.println("[4] Add Budget");
            System.out.println("[5] View Budget");
            System.out.println("[6] View Expenses");
            System.out.println("[7] View All Accounts");
            System.out.println("[0] Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addAccount();
                    break;

                case 2:
                    openAccount();
                    break;

                case 3:
                    System.out.println("\n----- Add Expense -----");
                    System.out.print("Enter Expense Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Expense Amount: ");
                    double amt = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Date (MM-DD-YYYY): ");
                    String date = sc.nextLine();
                    expenses.addExpense(name, amt, date);
                    break;

                case 4:
                    System.out.println("not done yet");
                    break;

                case 5:
                    System.out.println("not done yet");
                    break;

                case 6:
                    expenses.viewExpenses();
                    break;

                case 7:
                    user.showAllAccounts();
                    break;

                case 0:
                    System.out.println("Exiting system... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }          
        } while (choice != 0);
    }

    public static void addAccount() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        if (user.containsUsername(username)) {
            System.out.println("Username already exists!");
            return;
        }

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        Account newAccount = new Account(username, password);
        user.addAccount(newAccount);

        System.out.println("Account created successfully!");
    }
    public static void openAccount() {
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        Account acc = user.getAccount(username);

        if (acc != null && acc.getPassword().equals(password)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Please input the correct username and password.");
        }
    
    }
    public static void showAllAccounts(){
        user.showAllAccounts();

    }
} //hi po kaldag po i love you
