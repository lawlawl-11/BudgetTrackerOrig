package components;

public class CheckingBudget {

    private double totalBudget; 

    public CheckingBudget() {
        this.totalBudget = 0;
    }

    public void addBudget(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid budget amount.");
            return;
        }
        totalBudget += amount;
        System.out.println("Budget added successfully!");
    }

    public boolean deductBudget(double amount) {
        if (amount > totalBudget) {
            System.out.println("Not enough budget!");
            return false;
        }
        totalBudget -= amount;
        return true;
    }

    public void viewBudget() {
        System.out.println("Remaining Budget: ₱" + totalBudget);
    }
}
