import java.util.ArrayList;
public class ExpenseManager
{
    private ArrayList<expense>expenses;
    public ExpenseManager()
    {
        expenses=new ArrayList<>();
    }
    public void addExpense(expense exp)
    {
        expenses.add(exp);
        System.out.println("Expense added Successfully");
    }
    public void listAllExpenses()
    {
        if(expenses.isEmpty())
        {
            System.out.println("No expenses recorded yet");
            return;
        }
        System.out.println("\n--- All Expenses ---");
        for(expense e:expenses)
            System.out.println(e);
    }
    public double getTotalExpense()
    {
        double total=0;
        for(expense e:expenses)
            total=total+e.getAmount();
        return total;
    }
}