
import java.util.*;;
public class checkSorted {
    static boolean isSorted(int [] arr){
        boolean check=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                check=false;
            }
        }
        return check;
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

        System.out.println(" the Array is sorted?? :"+isSorted(arr));

    }
}
