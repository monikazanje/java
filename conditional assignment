package practical;
import java.util.Scanner;

public class conditional_assignment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        

        //------Write a program which takes the values of length and breadth from user and check if it is
        //a square or not.
        System.out.println("enter lenght");
        float lenght=sc.nextFloat();
        System.out.println("enter breath");
        float breath =sc.nextFloat();
        float area=lenght*breath;
        if(lenght!=breath){
            System.out.println("its a rectangle");

        }
        else{
            System.out.println("it is not rectangle");
        }

        

        //-------Write a program to print absolute value of a number entered by the user.

        System.out.println("enter the number");
        int num=sc.nextInt();
        if(num<0){
            System.out.println(num*-1);
        }
        else{
            System.out.println(num);
        }

        

        //----------- Write a program to take input from user for Cost Price (C.P.) and Selling Price(S.P.) and
        //calculate Profit or Loss.

        System.out.println("enter cost prise");
        int costPrise=sc.nextInt();
        System.out.println("enter selling prise");
        int sellingPrise=sc.nextInt();
        int profit=sellingPrise-costPrise;
        int loss=costPrise-sellingPrise;
        if(sellingPrise>costPrise){
            System.out.println("profit :"+profit);
        }
        else if(sellingPrise<costPrise){
            System.out.println("loss :"+loss);
        }
        else {
            System.out.println("no profit or no loos");
        }
        



        //----------Write a program to print positive number entered by the user, if user enters a negative
        //number, it is skipped

        System.out.println("enter an integer");
        int num=sc.nextInt();
        if(num>=0){
            System.out.println("the number is negative number");

        }
        else{
            System.out.println("the number is negative or skipped");
        }
        


        //----------- Create a calculator using switch statement to perform addition, subtraction, multiplication
        //and division.

        System.out.println("enter the operator (+,-,*,/,%) :");
        char op =sc.next().charAt(0);
        System.out.println("enter 1 operand");
        double num1=sc.nextDouble();
        System.out.println("enter 2 operand");
        double num2=sc.nextDouble();
        double ans;
        switch(op){
            case '+':
                ans=num1+num2;
                System.out.println(num1 + " + "+num2+"="+ans);
                break;
            case '-':
                ans=num1-num2;
                System.out.println(num1+" - "+num2+"="+ans);
                break;
            case '*':
                ans=num1*num2;
                System.out.println(num1+" * "+num2+"="+ans);
                break;
            case '/':
                ans=num1/num2;
                System.out.println(num1+" / "+num2+"="+ans);
                break;
            default:
                System.out.println("invalid");

        }

       


        //-------------Write a program to calculate marks to grades

        System.out.println("enter the marks");
        int marks=sc.nextInt();

        if(marks>=90){
            System.out.println("grade = A+");
        }
        else if(marks>=80){
            System.out.println("grade = A");
        }
        else if(marks>=70){
            System.out.println(" your grade = B+");
        }
        else if(marks>=60){
            System.out.println("your grade = B");
        }
        else if(marks>=60){
            System.out.println("your grade = C");
        }
        else if(marks>=50){
            System.out.println("your grade = D");
        }
        else if(marks>=40){
            System.out.println("your grade= E");
        }
        else if(marks<30){
            System.out.println("your grade = F");
        }
        else{
            System.out.println("enter valid marks");
        }

    }
}
