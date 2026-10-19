import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        ExpenseManager manager=new ExpenseManager();
        Scanner scanner=new Scanner(System.in);
        boolean running=true;
        System.out.println("=================================");
        System.out.println("  Welcome to Expense Tracker CLI  ");
        System.out.println("=================================");
        while(running)
        {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Expense");
            System.out.println("2. List All Expenses");
            System.out.println("3. Show Total Expense");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter Amount (₹): ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // consume newline

                    System.out.print("Enter Category (e.g. Food, Travel): ");
                    String category = scanner.nextLine();

                    System.out.print("Enter Description: ");
                    String description = scanner.nextLine();

                    expense newExpense = new expense(amount, category, description);
                    manager.addExpense(newExpense);
                    break;

                case 2:
                    manager.listAllExpenses();
                    break;

                case 3:
                    System.out.printf("Total Spent: ₹%.2f\n", manager.getTotalExpense());
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting application. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose between 1 and 4.");
            }
        }
        scanner.close();
    }
}