public class classLevelScope {
    int a=10;
    int b=5;
    int sum(){
        return a+b;
    }
    int sub(){
        return a-b;
    }

    public static void main(String[] args) {
        classLevelScope obj=new classLevelScope();
        obj.sum();
        obj.sub();
        System.out.println(obj.sum());
        System.out.println(obj.sub());
    }
}
