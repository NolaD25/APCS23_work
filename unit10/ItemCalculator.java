import java.util.*;

public class ItemCalculator{
    public static void print(ArrayList<Item> items){
        for(Item i: items){
            System.out.println(i.name() + " " + i.price());
        }
    }
    
    public static double averagePrice(ArrayList<Item> items){
        double sum = 0;
        for(Item i: items){
            sum += i.price();
        }
        return sum / items.size();
    }
    
    public static String mostExpensive(ArrayList<Item> items){
        float highestPrice = 0;
        String itemName = " ";
        for(Item i: items){
            if(i.price() > highestPrice){
                highestPrice = i.price();
                itemName = i.name();
            }
        }
        return itemName;
    }
    
    public static void main(String[] args){
        Item magazine = new Item("Magazine", 6);
        Item hearingAid = new Item("Hearing Aid", 3000);
        Item footBath = new Item("Foot Bath", 70);
        Item pnuematicWoodSplitter= new Item("Pnuematic Wood Splitter", 1300);
        //I asked my dad for item suggustions
        
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(magazine);
        items.add(hearingAid);
        items.add(footBath);
        items.add(pnuematicWoodSplitter);
        
        print(items);
        System.out.println("Average Price: " + averagePrice(items));
        System.out.println("Most Expensive Items: " + mostExpensive(items));
    }
    
}