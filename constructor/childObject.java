import java.io.*;
//whenever we creating child class object parent constructor  will be executed but parent class object wont be created
class p{

    p(){

        System.out.println(this.hashCode());
    }

}
class c extends p{
    c(){
        System.out.println(this.hashCode());
    }
}
public class childObject {
    public static void main(String[] args) {
        c obj=new c();
        System.out.println(obj.hashCode());
    }
}
