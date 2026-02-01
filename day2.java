import java.util.*;

public class day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int N = sc.nextInt();
        int sum = 0;
                while(N > 0){
                    int digit =  N % 10;
                    sum = sum + digit ;
                    N =  N/10;
                }
         System.out.print("sum of digits : ");
                System.out.println(sum);
    }
