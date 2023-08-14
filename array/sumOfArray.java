public class sumOfArray {
    void arrayElementSum( ){
        int [] arr={1,5,3};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        System.out.println("sum of array element ="+sum);
    }

    public static void main(String[] args) {
        sumOfArray obj=new sumOfArray();
        obj.arrayElementSum();
    }
    
}
