import java.util.Scanner;

public class Secoundmax {
    static int findMax(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int findSecoundMax(int [] arr){
        int mx=findMax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;

            }
        }
        int secoundMax=findMax(arr);
        return secoundMax;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter"+n+"elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("secound maximum element :"+findSecoundMax(arr));
    }
}
