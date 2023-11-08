import java.util.Scanner;

public class trailing {
    public static int trailingzeros(int n){
        int count=0;
        while(n>=5){
            n/=5;
            count =count+n;

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int count=trailingzeros(n);
        System.out.println(count);
    }
    
}
