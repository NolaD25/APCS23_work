import java.util.*;

public class PersonStats{
    public static double averagePets(ArrayList<Person> persons){
        double sum = 0;
        for(Person p: persons){
            sum += p.numPets();
        }
        return sum / persons.size();
    }
    public static String mostPet(ArrayList<Person> persons){
        int pets = 0;
        String pName = " ";
        for(Person p: persons){
            if(p.numPets() > pets){
                pets = p.numPets();
                pName = p.name();
            }
        }
        return pName;
    }
    public static ArrayList<Person> withTwo(ArrayList<Person> persons){
        ArrayList<Person> persons2 = new ArrayList<Person>();
        for(Person p : persons){
            if(p.numPets() == 2){
                persons2.add(p);
            }
        }
        return persons2;
    }
    
    public static void main(String[] args){
        Person emily = new Person("Emily", 2);
        Person daniel = new Person("Daniel", 1);
        Person sophia = new Person("Sophia", 3);
        Person ben = new Person("Ben", 0);
            
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(emily);
        persons.add(daniel);
        persons.add(sophia);
        persons.add(ben);
        
        System.out.println(averagePets(persons));
        System.out.println(mostPet(persons));
        
        ArrayList<Person> persons2 = PersonStats.withTwo(persons);
        for(Person p: persons2){
            System.out.println(p.name() + " " + p.numPets());
        }
    }
    
}