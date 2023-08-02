import java.io.*;
import java.util.Scanner;

public class fibonancii_series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int b=1;
        int sum=0;
        for(int i=0;i<=n;i++){
            System.out.println(b);
            sum=a+b;
            b=a;
            a=sum;
        }
    }
}
