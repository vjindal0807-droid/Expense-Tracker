import java.time.LocalDate;
public class expense
{
    private static int idCounter=1;
    private int id;
    private double amount;
    private String category;
    private String description;
    private LocalDate date;
    public expense(double amount,String category,String description)
    {
        this.id=idCounter++;
        this.amount=amount;
        this.category=category;
        this.description=description;
        this.date=LocalDate.now();
    }
    public int getId()
    {
        return id;
    }
    public double getAmount()
    {
        return amount;
    }
    public String getCategory()
    {
        return category;
    }
    public String getDescription()
    {
        return description;
    }
    public LocalDate getDate()
    {
        return date;
    }
    @Override 
    public String toString()
    {
        return String.format("ID: %d | Date: %s | Category: %-12s | Amount: Rs%.2f | Description: %s",id,date,category,amount,description);
    }
}