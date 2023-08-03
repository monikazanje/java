//import accessModifier.subSpecifier.app;
public class outsideClass {
    public static void main(String[] args) {
        app obj = new app();
        System.out.println("outside package , non child class"+obj.str_1);
        app3 obj3=new app3();
        obj3.printFromChildClass();
    }
}
class app3 extends app{
    void printFromChildClass(){
        app3 obj=new app3();
        System.out.println("child class" +obj.str_1);
    }
}
