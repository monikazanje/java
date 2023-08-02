
import java.io.*;

abstract class person1{
    String name ;
    int age;
    person1(String name, int age){
        this.name=name;
        this.age=age;
       
    }
    
}
class student1 extends person1{
    int marks;
    int rollNo;
    student1(String name, int age, int marks,int rollNo){
        super(name, age);
        this.marks=marks;
        this.rollNo=rollNo;
        
    }
    
}
class teacher1 extends person1{
    double salary;
    String sub;
    teacher1(String name, int age, double salary,String sub){
        super(name, age);
        this.salary=salary;
        this.sub=sub;
        
    }
}

public class withAbstractConstructor {
    public static void main(String[] args) {
        student s=new student("monika",21,101,99);
        teacher t=new teacher("monika",21,200000,"java");
        

    }
}
