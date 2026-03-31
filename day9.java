import java.util.*;
public class day9 {
    public static void main(String[] args) {
       int  arr[]={1,2,3,4,5};
       int max1 = arr[0];
       int max2 = arr[1];
       for(int i = 0 ; i<arr.length; i++) {
           if(arr[i] > max1) {
               max2 = max1;
               max1 = arr[i];
           }

       }
       System.out.print("second largest number is ;" +max2);
    }

    }
