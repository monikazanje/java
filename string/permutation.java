import java.util.Scanner;

public class permutation{
    public static int fact(int n){
        int result=1;
        for(int i=1;i<=n;i++){
            result=result*i;
        }
        return result;
    }

    public static int permutation1(String str){
        int[] count=new int[26];
        int len=str.length();

        for(int i=0;i<len;i++){
            count[str.charAt(i)-'a']++;
        }
        int result=fact(len);

        for(int i=0;i<26;i++){
            if(count[i]>1){
                result=result/fact(count[i]);
            }
        }
        return result;

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();

        int result = permutation1(str);
        System.out.println(result);
    }
}
