import java.util.*;
public class AcademicClass{
    public AcademicClass(Teacher teacher){
        students = new ArrayList<Student>();
        this.teacher = teacher;
    }
    public void addStudent(String name, int favNum){
        Student student = new Student(name, favNum);
        students.add(student);
    }
    public void info(){
        System.out.println(teacher.getName());
        for(Student s: students){
            System.out.print(s.getName() + ", ");
        }
    }
    public ArrayList<Student> studentNums(int n){
        ArrayList<Student> ifFavNum = new ArrayList<Student>();
        for(Student s: students){
            if(n == s.getFavNum()){
                ifFavNum.add(s);
            }
        }
        return ifFavNum;
    }
    public ArrayList<Student> studentNumsOdd(){
        ArrayList<Student> oddNums = new ArrayList<Student>();
        for(Student s: students){
            if(s.getFavNum() % 2 == 1){
                oddNums.add(s);
            }
        }
        return oddNums;
    }
    
    
    private ArrayList<Student> students;
    private Teacher teacher;
}