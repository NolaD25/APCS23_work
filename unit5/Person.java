public class Person{
    public Person(String  nameIn, int numPetIn){
        name = nameIn;
        numPet = numPetIn;
    }
    public void namePet(){
        System.out.println("hello, my name is " + name + " and I have " + numPet + " pets");
    }
    
    private String name;
    private int numPet;
    
    
}