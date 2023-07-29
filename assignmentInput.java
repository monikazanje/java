
package practical;
import java.util.Scanner;


public class input_assignment {
    public static void main(String[] args) {
        //----------- Input name, roll number and field of interest from user and print in the format below :
        //Name: xyz, Roll number: xyz, Field of interest: xyz-----------

        Scanner sc=new Scanner(System.in);

       /* String first_name=sc.next();
        String Last_name=sc.next();
        int roll=sc.nextInt();
        String field_of_interest =sc.nextLine();
        System.out.println("name :"+first_name +" "+Last_name);
        System.out.println("roll number:"+roll);
        System.out.println("field of interest :"+field_of_interest);

        */
        //----------Input two different string and print them in same line.-------------

        /*
        System.out.println("enter two strings");
        String first=sc.nextLine();
        String sec=sc.nextLine();
        System.out.println(first+sec);

         */

        //------------If the marks of Robert in three subjects are entered through keyboard (each out of 100), write a program
        //to calculate his total marks and percentage marks.----------

       /* System.out.println("enter the marks");
        float math=sc.nextFloat();
        float science=sc.nextFloat();
        float eng=sc.nextFloat();
        float per=(math +science+eng )/3;
        System.out.println("math :" +math);
        System.out.println("science :"+science);
        System.out.println("eng :"+eng);
        System.out.println("percentage of marks is :" +per);

        */
        //-----------Given two numbers, return their sum in the following format:
        //Int t representing number of test cases
        //T lines of Two integers representing the numbers to be added-----------

        int t=sc.nextInt();
        for(int i=1;i<=t;i++){

            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.print(a+b);
        }

        //------------ Given few lines of input(number of lines unknown) where each line has two
        //strings, concatenate the strings.--------------

       /* while(sc.hasNextLine()){
          
            String a=sc.next();
            String b=sc.next();
            System.out.println(a+b);
        }

        */

    }
}
