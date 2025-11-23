package components;

import java.util.ArrayList;

public class UserAccounts {
    private ArrayList<Account> accounts;

    public UserAccounts() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public boolean containsUsername(String username) {
        for (Account acc : accounts) {
            if (acc.getUsername().equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void showAllAccounts() {
        System.out.println("=== Account List ===");
        if (accounts.isEmpty()) {
            System.out.println("No accounts found. Please add an account first.");
        } else {
            for (Account acc : accounts) {
                System.out.println("- " + acc.getUsername());
            }
        }
    }

    public Account getAccount(String username) {
        for (Account acc : accounts) {
            if (acc.getUsername().equals(username)) {
                return acc;
            }
        }
        return null;
    }
}