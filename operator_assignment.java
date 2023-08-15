
import java.util.Scanner;

public class operator_assignment {
    public static void main(String[] args) {
        //---------Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
        //is taken with 5 and then multiply the resultant value by 5. Display the final result.


        Scanner sc=new Scanner(System.in);
       /* int x=sc.nextInt();
        System.out.println((((x+8)/3)%5)*5);



        */
        //-------- Swap two numbers without the use of third variable.

     /*   int a=sc.nextInt();
        int b=sc.nextInt();
        int swap;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a: "+a);
        System.out.println("b: " +b);


      */
        //-------------- Write a program to calculate the sum of the digits of a 3-digit number.

       /*

        int p = sc.nextInt();
        int sum = 0;
        while(p > 0){
            sum += p % 10;
            p /= 10;
        }
        System.out.println(sum);

        */
        //-----------Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
        // i) both the conditions 'a < 50' and 'a < b' are true.
        //ii) at least one of the conditions 'a < 50' or 'a < b' is true.
        int a=50;
        int b=70;
        System.out.println((a<50) && (a<b));
        System.out.println((a<50) || (a<b));

        //----------- - Find the total number of bits needed to be flipped to convert x to y.
        int x = sc.nextInt();
        int y = sc.nextInt();
        int n = x ^ y;
        int count = 0;
        while (n != 0){
            n = n & (n - 1);
            count++;
        }
        System.out.print(count);
    }
}
