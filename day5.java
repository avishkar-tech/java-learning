import java.util.*;
public class day5 {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < 5; i++) {
            if (num[i] == target) {
                System.out.println("targeted number found at index = " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("targeted number not found");
        }
    }
        }
