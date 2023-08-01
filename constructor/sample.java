import java.util.*;
public class sample {
    String name;
    int roll_no;
    sample(String name, int roll_no) {
        this.name=name;
        this.roll_no=roll_no;
    }

    public static void main(String[] args) {
        sample s1=new sample("monika",101);
        sample s2=new sample("sakshi",102);
        System.out.println(s1.name+"  "+s1.roll_no);
        System.out.println(s2.name+"  "+s2.roll_no);
    }
}
