import java.io.*;
class abc1{
    static int count=0;
     void main(){
         count++;
        System.out.println(count);
    }

}

public class staticForIncrementVar {
    public static void main(String[] args) {
        abc1 obj1=new abc1();
        abc1 obj2=new abc1();
        obj1.main();
        obj2.main();


    }
}
