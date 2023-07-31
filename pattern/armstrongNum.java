import java.util.Scanner;

public class armstrongNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int count=String.valueOf(num).length();
        int tempnum=num;
        int sum=0;
        while(tempnum!=0){
             int digit=tempnum%10;
             sum +=Math.pow(digit,count);
             tempnum=tempnum/10;

        }
        if(sum==num){
            System.out.println(num+ "it is amstrong number");
        }
        else{
            System.out.println("number is not amstrong number");
        }
    }
    
}
