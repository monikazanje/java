import java.util.Scanner;

public class swapReverseArray {
    static void swap(int [] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void reverseArray(int [] arr){

        int i=0;
        int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int a=9,b=3;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter"+n+"elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverseArray(arr);
        System.out.println("reverse array");

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
