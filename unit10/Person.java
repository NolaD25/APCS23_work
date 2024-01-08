public class Person{
    public Person(String name, int numPets){
        this.name = name;
        this.numPets = numPets;
    }
    
    public String name() {return name;}
    public int numPets() {return numPets;}
    
    private String name;
    private int numPets;
    
}