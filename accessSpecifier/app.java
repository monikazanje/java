//package accessModifier.subSpecifier;

public class app {
    public String str_1="I am public member";

    void printFromClass(){
        System.out.println("within class :"+str_1);
    }

    public static void main(String[] args) {
        app obj=new app();
        obj.printFromClass();
        System.out.println( "within class:"+obj.str_1);
        app2 obj2=new app2();
        obj2.printFromOutsideClass();
    }

}
class app2{
    void printFromOutsideClass(){
        app obj=new app();
        System.out.println("within the package, outside the class" +obj.str_1);

    }
}
