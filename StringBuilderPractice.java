import java.util.*;
public class stringbuilderbasics {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        sb.append( "hello");
        sb.insert(0,'H');
        sb.delete(0,3);
        sb.charAt(0);

        System.out.println(sb.charAt(0)); // prints 'l'
        System.out.println(sb);
    }
}
