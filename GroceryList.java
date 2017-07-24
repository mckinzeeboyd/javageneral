import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Please list three items on your grocery shopping list.");
        
        
        String Item1;
        out.print("Item 1? ");
        Item1 = keyboard.nextLine();
        out.println("");
        
        
        String Item2;
        out.print("Item 2? ");
        Item2 = keyboard.nextLine();
        out.println("");
        
        String Item3;
        out.print("Item 3? ");
        Item3 = keyboard.nextLine();
        out.println("");
        
        out.println("Now, please enter the quantity of each item.");
        
        out.print("How many " + Item1 + "? ");
        int quantity1 = keyboard.nextInt();
        out.println("");
        
        out.print("How many " + Item2 + "? ");
        int quantity2 = keyboard.nextInt();
        out.println("");
        
        out.print("How many " + Item3 + "? ");
        int quantity3 = keyboard.nextInt();
        out.println("");
        
        out.println("Now, please enter the price of each item.");
        
        out.print("How much does one " + Item1 + " cost? ");
        float price1 = keyboard.nextFloat();
        out.println("");
        
        out.print("How much does one " + Item2 + " cost? ");
        float price2 = keyboard.nextFloat();
        out.println("");
        
        out.print("How much does one " + Item3 + " cost? ");
        float price3 = keyboard.nextFloat();
        out.println("");
        
        out.println("Calculating your grocery bill.");
        
       
        float item1cost = quantity1 * price1;
        float item2cost = quantity2 * price2;
        float item3cost = quantity3 * price3;
        
        float finalCost = item1cost + item2cost + item3cost;
        
        out.print("Your total cost is " + finalCost);

        
        
    }
}

        
        
        
    
    
    
    
    
    
    