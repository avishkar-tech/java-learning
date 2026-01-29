public class BasicJava {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        int sum = a + b;

        System.out.println("Sum is: " + sum);

        if (sum > 20) {
            System.out.println("Sum is greater than 20");
        } else {
            System.out.println("Sum is 20 or less");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Loop count: " + i);
        }
    }
}
