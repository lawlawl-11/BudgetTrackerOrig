package components;

public abstract class FinanceItem {

    protected String name;
    protected double amount;

    public FinanceItem(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public abstract void display(); // abstraction
}
