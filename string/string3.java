// output:
// monika monika monika monika
// monika
// for new s1 obj
// monikasolution


public class string3 {
    public static void main(String[] args) {
        String s1=new String("monika");
        String s2=new String("monika");
        String s3="monika";
        String s4="monika";
        System.out.println(s1+" " +s2+" "+s3+" "+s4);

        s1.concat("software");
        System.out.println(s1);
        System.out.println("for new s1 obj");

        s1=s1.concat("solution");
        System.out.println(s1);
    }
}
