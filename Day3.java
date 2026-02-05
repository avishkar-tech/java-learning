import java.util.*;
public class array {
    public static void main(String[] args) {
        int[]number = {6785,56,345,100,50};
        int max =  number[0];
       for(int i=0; i<=4; i++) {
           if (max < number[i]) {
               max = number[i];
           }
       }
           System.out.println(max);



    }
}
