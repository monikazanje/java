import java.util.Scanner;
public class changeElementVal {
    static void printArray( int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int [n];
        System.out.println("enter the element of original array :");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original integer array :");
        printArray(arr);

        int [] arr_2=arr;
        System.out.println("copied array");
        printArray(arr_2);

        // change in array
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("original array after change");
        printArray(arr);
        System.out.println("copied array after change");
        printArray(arr_2);
    }
    
}
