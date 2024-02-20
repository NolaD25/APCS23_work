import java.util.*;

public class ShapeCollection{
    public ShapeCollection(){
        shapes = new ArrayList<Shape>();
    }
    public void addShape(String name, int numSides){
        Shape shape = new Shape(name, numSides);
        shapes.add(shape);
    }
    public int numberOfSides(String name){
        int sides = 0;
        for(Shape s: shapes){
            if(name.equals(s.getName())){
                sides = s.getNumSides();
            }
        }
        return sides;
    }
    public double sidesAverage(){
        int total = 0;
        int count = 0;
        for(Shape s: shapes){
            total += s.getNumSides();
            count ++;
        }
        return total / count;
    }
    public ArrayList<Shape> evenSides(){
        ArrayList<Shape> ifEvenSides = new ArrayList<Shape>();
        for(Shape s: shapes){
            if(s.getNumSides() % 2 == 0){
                ifEvenSides.add(s);
            }
        }
        return ifEvenSides;
    }
    
    private ArrayList<Shape> shapes;
    
}