import java.util.Scanner;

public class numPermutaton {
    public static int fact(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;
    }

    public static int permutation(String str){
        int len=str.length();
        //int[] count=new int[26];

        int countOfZero=0;
        int countOfOne=0;
        for(int i=0;i<len;i++){
            if(str.charAt(i)=='0'){
                countOfZero++;
            }
            else if(str.charAt(i)=='1'){
                countOfOne++;
            }
        }
        int result=fact(len);

        result=result/fact(countOfOne);
        result=result/fact(countOfZero);
        return result;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int result=permutation(str);
        System.out.println(result);
    }
    
}
