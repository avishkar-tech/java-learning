import java.util.*;
public class Day6 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int start = 0;
        int end = arr.length-1;
        while(start <= end ){
            int mid = (start+end)/2;
            if(target==arr[mid]) {
                System.out.println("found at index="+mid);
                break;
            }
            else if (target > arr[mid]) {
                start = mid+1;

            }
                else {
                end = mid - 1;
            }


            }
        }

    }

