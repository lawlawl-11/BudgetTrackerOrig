****Budget Tracker****
---
****Description/Overview****
---
The Budget Tracker System is a Java console-based application designed to help users manage their financial
activities by creating accounts, setting budgets, and tracking expenses. The system allows multiple users to
register and log in, add expenses, set budgets, and view financial records. It applies Object-Oriented
Programming (OOP) principles such as encapsulation, abstraction, inheritance, and polymorphism to ensure
modularity, maintainability, and scalability. This program helps solve the problem of unorganized expense
tracking by providing a structured and secure system for managing budgets and expenses.

****OOP Concepts applied****
---
**a. Encapsulation**

Data such as usernames, passwords, budgets, and expenses are encapsulated within their respective classes
(e.g., Account, CheckingBudget, CheckingExpenses). Access to data is controlled through methods like 
getPassword() and addBudget().

**b. Abstraction**

The system hides internal logic by allowing the main program (BudgetTracker) to interact with objects through
methods instead of directly accessing data. For example, budget and expense details are handled internally by
their respective classes.

**c. Inheritance**

The program structure allows expense and budget-related classes to extend or share common behavior through a 
base structure (depending on implementation in the components package).

**d. Polymorphism**

Polymorphism is demonstrated when the display() method is called on the CheckingExpenses object. This allows 
different implementations of display behavior while using a common method name.

**e. Exception Handling**

The program uses try-catch blocks to handle invalid inputs such as non-numeric values when entering budgets or expenses, preventing the program from crashing.

****Program Structure****
---   
****Main Class****

 **-BudgetTracker**
 
    -Acts as the main driver of the application.
    -Displays the menu system.
    -Handles user input and navigation.
    -Communicates with other classes to perform operations.

****Components****

 **-Account**
 
    -Stores user credentials (username and password).
 **-UserAccounts**
 
    -Manages multiple user accounts.
    -Adds accounts, checks existing usernames, and retrieves account data.
 
 **-CheckingBudget**
 
    -Handles budget-related operations.
    -Adds and displays budget amounts.
 
 **-CheckingExpenses**
    
    -Manages expense records.
    -Adds and displays expenses.
 **-FinanceItem**
   
    -Base class for all financial records
    -Contains shared attributes (name, amount)
    -Declares abstract method display()
 
 **-budget**
 
    -Responsible for managing the user’s total budget.
    -Stores the budget value internally and prevents direct modification from other classes.

****How to Run the Program****
---
**-Requirements**
  
    -Java Development Kit (JDK) 8 or later
    -Any Java IDE (IntelliJ, Eclipse, NetBeans) or Command Prompt

**-Steps to Run**
   
    -1. Ensure the project folder contains:
     main package
     components package
    -2. Compile the program
    -3. Run the program

****Sample Output****
---
  ****=== BUDGET TRACKER SYSTEM ===****

    [1] Add Account
    [2] Open Account
    [3] Add Expenses
    [4] Add Budget
    [5] View Budget
    [6] View Expenses
    [7] View All Accounts
    [0] Exit

****Authors****
---
   **• Esta, Jake Daniel S.**
   
   **• Tan, Gabriel Mark G.**
   
   **• Tibayan, Lawrence C.**

****Other Sections you may include:****
---

   A. Future Enhancements- For further improvement of this console. we would like to add GUI to make the 
   console more fun to use and more pleasing with the eye. Also improves some of the other features for
   better improvements.
   B. References: 
   https://codewithcurious.com/projects/budget-tracker-using-java/
   https://www.includehelp.com/java-programs/banking-management-system.aspx
   https://www.geeksforgeeks.org/java/mini-banking-application-in-java/
  
   
                  
 
