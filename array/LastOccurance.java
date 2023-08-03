import java.util.Scanner;
public class LastOccurance {
    static int lastOccurence(int [] arr, int x){
        int lastIndex=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                lastIndex=i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("enter x");
        int x=sc.nextInt();
        System.out.println("Last Occurance of x:"+lastOccurence(arr,x));
    }
}
