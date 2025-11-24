package components;

import java.util.ArrayList;

public class CheckingExpenses {

    private class Expense {
        String name;
        double amount;
        String date;

        Expense(String name, double amount, String date) {
            this.name = name;
            this.amount = amount;
            this.date = date;
        }
    }

    private ArrayList<Expense> expenses = new ArrayList<>();

    //4 Add Expenses
    public void addExpense(String name, double amount, String date) {
        expenses.add(new Expense(name, amount, date));
        System.out.println("\nExpense added successfully!\n");
    }

    //7 View Expenses
    public void viewExpenses() {
        System.out.println("\n----- Expense History -----");

        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.\n");
            return;
        }

        double total = 0;
        int count = 1;

        for (Expense e : expenses) {
            System.out.println(count + ". " + e.name + " - " + e.amount + " - " + e.date);
            total += e.amount;
            count++;
        }

        System.out.println("\nTotal Expenses: " + total + "\n");
    }
}
