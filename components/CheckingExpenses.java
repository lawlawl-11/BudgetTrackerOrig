package components;

import java.util.ArrayList;

// INHERITANCE
public class CheckingExpenses extends FinanceItem {

    private ArrayList<String> expenses; // encapsulation
    private CheckingBudget budget;

    public CheckingExpenses(CheckingBudget budget) {
        super("Expenses", 0);
        this.budget = budget;
        this.expenses = new ArrayList<>();
    }

    public void addExpense(String name, double amount, String date) {

        if (!budget.deductBudget(amount)) {
            System.out.println("Expense not added.");
            return;
        }

        expenses.add(name + " - ₱" + amount + " (" + date + ")");
        System.out.println("Expense added successfully!");
    }

    // POLYMORPHISM
    @Override
    public void display() {
        viewExpenses();
    }

    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses recorded.");
            return;
        }

        System.out.println("\n--- Expenses ---");
        for (String e : expenses) {
            System.out.println(e);
        }
    }
}
