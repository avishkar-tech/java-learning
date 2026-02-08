import java.util.*;
public class day4 {
    public static void main(String[] args) {
       String name = "avishkar";
       System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(5));
        StringBuilder nw = new StringBuilder("hello");
        // add text
        nw.append(" world");
        //change text
       nw.setCharAt(0,'f');
       System.out.println(nw);



    }
}
