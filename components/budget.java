package components;

public class budget {
    private double totalBudget;

    public budget() {
        totalBudget = 0;
    }

    public void addBudget(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid budget amount.");
            return;
        }
        totalBudget += amount;
        System.out.println("Budget added successfully!");
    }

    public void viewBudget() {
        System.out.println("=== CURRENT BUDGET ===");
        System.out.println("Total Budget: " + totalBudget);
    }

    public double getTotalBudget() {
        return totalBudget;
    }
}