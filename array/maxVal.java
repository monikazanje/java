public class maxVal {
    void maxOfArray(){
        int [] arr={5,4,6,7,8,2,3,9,10,5,8};
        int ans=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
        }
        System.out.println("max value is"+ans);
    }

    public static void main(String[] args) {
        maxVal obj=new maxVal();
        obj.maxOfArray();
    }
    
}
