import java.util.Scanner;

public class AsPowerOfB {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a = ");
        long a=sc.nextLong();
        System.out.println("enter value of b = ");
        long b=sc.nextLong();
        long ans=1;
        for(int i=1;i<=b;i++){
            ans *=a;
        }
        System.out.println("ans is = "+ans);
    }
    
}
