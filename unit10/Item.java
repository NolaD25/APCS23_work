public class Item{
    public Item(String name, float price){
        this.name = name;
        this.price = price;
    }
    
    public String name() {return name;}
    public float price() {return price;}
    
    private String name;
    private float price;
}