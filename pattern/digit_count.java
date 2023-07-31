import java.util.Scanner;

public class digit_count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //count the number of the digit in the number
        System.out.println("enter the number to be count the digit");
        int n=sc.nextInt();
        int original_n=n;
        int numberOfCount=0;
        while(n>0)
        {
            n=n/10;
            numberOfCount++;
        }
        System.out.println("number of count of "+ original_n+" " +numberOfCount);
    }
}
