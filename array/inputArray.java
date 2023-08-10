
import java.util.Scanner;

public class inputArray {
    static void array_input(int n , int[] arr){
        for(int i=0;i<n;i++){
          Scanner sc=new Scanner(System.in);
          int input=sc.nextInt();
           arr[i]=input;
        }
        System.out.println("the number you entered are :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("no of elements in the array");
        int n=sc.nextInt();
        int [] arr=new int [n];
        array_input(n,arr);
       // System.out.println(arr);
    }
}
