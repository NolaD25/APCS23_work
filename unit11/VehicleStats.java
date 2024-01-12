import java.util.*;
public class VehicleStats{
    public static int allWheels(ArrayList<Vehicle> vehicles){
        int totalW = 0;
        for(Vehicle v: vehicles){
            totalW += v.wheelCount();
        }
        return totalW;
    }
    public static ArrayList<Vehicle> humanPowered(ArrayList<Vehicle> vehicles){
        ArrayList<Vehicle> ifHumanPowered = new ArrayList<Vehicle>();
        for(Vehicle h: vehicles){
            if(h.isHumanPowered() == true){
                ifHumanPowered.add(h);
            }
        }
        return ifHumanPowered;
    }
    public static void main(String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        
        Car c1 = new Car("Car", 4, false);
        vehicles.add(c1);

        vehicles.add(new Motorcycle("Motorcycle", 2, false));
        vehicles.add(new Bicycle("Bicycle", 2, true));
        vehicles.add(new Unicycle("Unicycle", 1, true));
        
        System.out.println(allWheels(vehicles));
        
        ArrayList<Vehicle> vehicles2 = VehicleStats.humanPowered(vehicles);
        for(Vehicle v: vehicles2){
            System.out.println(v.name() + " " + v.isHumanPowered());
        }
        
    }
    
}