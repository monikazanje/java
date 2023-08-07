public class searchArray {
    void arraySearch(){
        int [] arr={5,6,7,8,3,2,7,9};
        int x=6;
        int ans=-1;
        for( int i=0;i<arr.length;i++){
            if(arr[i]==x){
                ans=i;
                break;
            }
        }
        System.out.println("found "+x+" at index ="+ans);
    }

    public static void main(String[] args) {
        searchArray obj=new searchArray();
        obj.arraySearch();
    }
    
}
