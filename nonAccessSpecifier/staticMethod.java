import java.io.*;
public class staticMethod {
    static int a=10;
    int b=30;
     void simpleDisplay(){
         System.out.println(a);
         System.out.println(b);
     }
     static void staticDisplay(){
         System.out.println(a);

     }

    public static void main(String[] args) {
        staticMethod obj3=new staticMethod();
        obj3.simpleDisplay();
        staticDisplay();
    }
}
