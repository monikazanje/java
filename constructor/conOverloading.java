import java.util.*;

public class conOverloading {
    conOverloading(double d){
        this(10);
        System.out.println("double argument constructor");
    }
    conOverloading(int i){
        this ();
        System.out.println("integer argument constructor");
    }
    conOverloading(){
        System.out.println("no argument constructor");
    }

    public static void main(String[] args) {
        conOverloading t1=new conOverloading(10.3);
        //conOverloading t2=new conOverloading(10);
       // conOverloading t3=new conOverloading();
    }
}
