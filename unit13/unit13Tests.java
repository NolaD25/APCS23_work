import java.util.*;

public class unit13Tests{
    public static void main(String[] args){
        ShapeCollection one = new ShapeCollection();
        one.addShape("Square", 4);
        one.addShape("Triangle", 3);
        one.addShape("Hexagon", 6);
        one.addShape("Dodecagon",  12);
        
        System.out.println(one.numberOfSides("Square"));
        System.out.println(one.sidesAverage());
        
        ArrayList<Shape> evenShapes = one.evenSides();
        for(Shape s: evenShapes){
            System.out.println(s.getName());
        }
        
        Teacher a = new Teacher("Julie", "Science");
        
        AcademicClass two = new AcademicClass(a);
        two.addStudent("Fin", 13);
        two.addStudent("Rey", 1);
        two.addStudent("Poe", 8);
        two.addStudent("Luke", 10);
        
        two.info();
        ArrayList<Student> favNums = two.studentNums(13);
        for(Student s: favNums){
            System.out.println(s.getName());
        }
        ArrayList<Student> oddNums = two.studentNumsOdd();
        for(Student s: oddNums){
            System.out.println(s.getName());
        }

    }
}