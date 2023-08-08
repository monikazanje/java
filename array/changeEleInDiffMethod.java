public class changeEleInDiffMethod {
    static void changeArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=0;
        }
    }

    public static void main(String[] args) {

        int [] arr=new int [3];
        arr[0]=5;
        arr[1]=7;
        arr[2]=9;
        changeArray(arr);
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    
}
