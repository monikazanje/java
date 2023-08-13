import java.util.Scanner;

public class noOfOccuranceOfX {
    static int countOcuurancce(int [] arr,int x){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
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
        System.out.println("count of x is :"+countOcuurancce(arr,x));


    }
    
}
