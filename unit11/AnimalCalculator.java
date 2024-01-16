import java.util.*;
public class AnimalCalculator{
    public static void AnimalList(ArrayList<Animal> animals){
         for(Animal a: animals){
             System.out.println(a.getName());
             System.out.println(a.getLegCount());
             if(a.getFurriness() == true){
                 System.out.println("Furry");
             }else{
                 System.out.println("Not furry");
             }
         }
    }
    public static double legAverage(ArrayList<Animal> animals){
        int total = 0;
        for(Animal a: animals){
            total += a.getLegCount();
        }
        return total / animals.size();
    }
    public static String leastLegs(ArrayList<Animal> animals){
        int legs = 1306;  //the record for the most legs an animal could have
        String legAnimal = " ";
        for(Animal a: animals){
            if(a.getLegCount() < legs){
                legs = a.getLegCount();
                legAnimal = a.getName();
            }
        }
        return legAnimal;
    }
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<Animal>();
        
        animals.add(new Rhino("Rhino", 4, false));
        animals.add(new Owl("Owl", 2, false));
        animals.add(new Lemur("Lemur", 4, true));
        animals.add(new Starfish("StarFish", 5, false));
        
        AnimalList(animals);
        System.out.println(legAverage(animals));
        System.out.println(leastLegs(animals));
    }
    
}