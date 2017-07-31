import static java.lang.System.out;
import java.util.Scanner;

public class SandwhichShop
{
    public static void main (String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        int goalForVeggies =50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup=70;
        
        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwhiches is 50");
        out.println("How many veggie sandwiches were sold today?");
        
        int veggies;
        veggies = keyboard.nextInt();
        out.println();
        
        if (veggies >= goalForVeggies)
        {
            out.println("Made goal for veggies.");
        }
        
        else
        {
            out.println("Fell short");
        
    }
    
        out.println("The sales goal for burgers is 250");
        out.println("How many burgers were sold today?");
        
        int burgers;
        burgers = keyboard.nextInt();
        out.println();
        
        if (burgers >= goalForBurgers)
        {
            out.println("Made goal for burgers.");
        }
        
        else
        {
            out.println("Fell .");
        }
        
        out.println("The sales goal for subs is 180");
        out.println("How many subs were sold today?");
        
        int subs;
        subs = keyboard.nextInt();
        out.println();
        
        if (subs >= goalForSubs)
        {
            out.println("Made goal for subs.");
        }
        
        else 
        {
            out.println("Fell short.");
        }
        
        out.println("The sales goal for soup is 70");
        out.println("How many soups were sold today?");
        
        int soups;
        soups = keyboard.nextInt();
        out.println();
        
        if (soups >= goalForSoup)
        {
            out.println("Made goal for soup.");
        }
        
        else 
        {
            out.println("Fell short.");
        }
        
        out.println();
        
        if (veggies>=goalForVeggies && burgers>=goalForBurgers && subs>=goalForSubs && soups>=goalForSoup)
        {
           out.println("Made goal for everything!");
        }
        
        else
        {
           out.println("Try better next time.");
        } 
        
}
}