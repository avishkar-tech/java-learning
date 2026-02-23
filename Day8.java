import java.util.*;
public class Day8 {
    public static void main(String[] args) {
        int[]number = {5,2,9,1};
        for(int i = 0 ; i < number.length/2 ; i++){
            int temp = number[i];
            number[i]= number[number.length - 1 - i];
            number[number.length - 1 - i ] = temp;

        }
    for(int i = 0; i < number.length;i++){
        System.out.print(number[i] +" ");
    }
    }
}
