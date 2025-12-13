package main;

import java.util.Scanner;

import components.Account;
import components.CheckingBudget;
import components.CheckingExpenses;
import components.UserAccounts;

public class BudgetTracker {

    private static final Scanner sc = new Scanner(System.in);
    private static final UserAccounts user = new UserAccounts();

    private static final CheckingBudget budget = new CheckingBudget();
    private static final CheckingExpenses expenses = new CheckingExpenses(budget);

    public static void main(String[] args) {
        int choice = -1;


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

            try { // EXCEPTION HANDLING
                choice = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1 -> addAccount();
                case 2 -> openAccount();
                case 3 -> addExpenses();
                case 4 -> addBudget();
                case 5 -> budget.viewBudget();
                case 6 -> expenses.display(); // polymorphism used
                case 7 -> user.showAllAccounts();
                case 0 -> System.out.println("Exiting system... Goodbye!");
                default -> System.out.println("Invalid choice.");
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

        user.addAccount(new Account(username, password));
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
            System.out.println("Incorrect username or password.");
        }
    }

    public static void addExpenses() {
        try {
            System.out.print("Enter Expense Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Expense Amount: ");
            double amt = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter Date (MM-DD-YYYY): ");
            String date = sc.nextLine();

            expenses.addExpense(name, amt, date);

        } catch (Exception e) {
            System.out.println("Invalid input!");
            sc.nextLine();
        }
    }

    public static void addBudget() {
        try {
            System.out.print("Enter amount to add to budget: ");
            double amount = sc.nextDouble();
            sc.nextLine();
            budget.addBudget(amount);
        } catch (Exception e) {
            System.out.println("Invalid amount!");
            sc.nextLine();
        }
    }
}
