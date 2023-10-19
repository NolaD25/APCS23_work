public class Rectangle{
    public Rectangle(double baseIn, double heightIn){
        base = baseIn;
        height = heightIn;
        
    }
    public double getBase(){
        return base;
    }
    public double getHeight(){
        return height;
    }
    public void area(){
        
        System.out.println(base*height);
    }
    public void perimeter(){
        System.out.println(base + base + height + height);
    }
    public void diagonal(){
        System.out.println(Math.sqrt(Math.pow(base,2) + Math.pow(height,2)));
    }
    private double base;
    private double height;
    
}