import java.util.Scanner;

public class cross_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(i==j || (i+j)==num-1){
                    System.out.print(" * ");

                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }




    }
}
