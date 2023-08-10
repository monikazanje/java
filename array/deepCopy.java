import java.util.Scanner;

public class deepCopy {
    static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array");
        printArray(arr);
        int [] arr_2=arr.clone();
        System.out.println("copied array");
        printArray(arr_2);
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("original array after chane");
        printArray(arr);
        System.out.println("clone array after change");
        printArray(arr_2);
    }
    
}
