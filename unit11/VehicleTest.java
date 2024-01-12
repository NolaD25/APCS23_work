import java.util.*;

public class VehicleTest{
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        
        Car c1 = new Car("Car", 4, false);
        vehicles.add(c1);

        vehicles.add(new Motorcycle("Motorcycle", 2, false));
        vehicles.add(new Bicycle("Bicycle", 2, true));
        vehicles.add(new Unicycle("Unicycle", 1, true));
        
        for(Vehicle v: vehicles){
            System.out.println(v.name());
            System.out.println(v.wheelCount());
            System.out.println(v.isHumanPowered());
            System.out.println();
            
        }
    }
    
}