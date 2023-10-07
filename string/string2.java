//output:
// for string :
// false
// true
// for StringBuffer :
// false
// false

import java.sql.SQLOutput;

public class string2 {
    public static void main(String [] args){
        String s1=new String("monika");
        String s2=new String("monika");
        System.out.println("for string :");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        //for string buffer

        StringBuffer sb1=new StringBuffer("monika");
        StringBuffer sb2=new StringBuffer("monika");
        System.out.println("for StringBuffer :");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
    }
}
