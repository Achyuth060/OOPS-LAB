import java.util.Scanner;  // Import Scanner class to get user input

public class Addition{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create scanner object to read user input

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();  // Read first number

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();  // Read second number

        int sum = num1 + num2;  // Perform addition
        System.out.println("The sum is: " + sum);  // Display the result
    }
}
