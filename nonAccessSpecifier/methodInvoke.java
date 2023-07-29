
import java.io.*;


public class methodInvoke {
    static int num=100;
    static String str="i am monika";
    static void display(){
        System.out.println("static number is :"+num);
        System.out.println("static string is :"+str);
    }
    void nonStatic(){
        display();
    }

    public static void main(String[] args) {
        methodInvoke object=new methodInvoke();
        object.nonStatic();
        display();
    }
}
