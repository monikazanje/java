public class takeInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];

        System.out.println("enter the elements of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
