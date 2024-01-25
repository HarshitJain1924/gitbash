import java.util.*;

public class MultiplyDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();
        scanner.close();
        int originalNumber = number;
        int product = 1;
        while (number > 0) {
            int digit = number % 10;
            product *= digit;
            number /= 10;
        }
        System.out.println("The multiplication of all digits in " + originalNumber + " is " + product);
    }
}
