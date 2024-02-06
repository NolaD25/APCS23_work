public class Rectangle{
    public Rectangle(String name, double width, double height){
        this.name = name;
        this.width = width;
        this.height = height;
    }
    public String getName(){
        return name;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    
    public double perimeter(){
        return (width * 2) + (height  * 2);
    }
    public double area(){
        return width * height;
    }
    
    private String name;
    private double width, height;
}