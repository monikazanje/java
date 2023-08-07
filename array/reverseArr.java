public class reverseArr {
    static void printArray(int [] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    static int [] reverseArr(int [] arr){
        int n=arr.length;
        int [] ans=new int [n];
        int j=0;
        for(int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
            ans[0]=5;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        return ans;
    }

    public static void main(String[] args) {
        int a=9;
        int b=3;
        int [] arr={1,2,3,4,5};
        reverseArr(arr);


    }
}
