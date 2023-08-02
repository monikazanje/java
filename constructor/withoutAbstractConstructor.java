import java.io.*;


abstract class person{
    String name;
    int age;
}
class student extends person{
    int marks;
    int rollNo;
    student(String name,int age, int marks, int rollNo){
        this.name=name;
        this.age=age;
        this.marks=marks;
        this.rollNo=rollNo;
    }
}
class teacher extends person{
    double salary;
    String sub;
    teacher( String name,int age, double salary,String sub){
        this.name=name;
        this.age=age;
        this.salary=salary;
        this.sub=sub;
    }
}

public class withoutAbstractConstructor {
    public static void main(String[] args) {
        student s=new student("monika",21,101,99);
        teacher t=new teacher("monika",21,200000,"java");
    }
}
