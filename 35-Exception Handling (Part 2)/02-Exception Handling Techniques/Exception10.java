import java.util.Scanner;

// Class Alpha1 handles the division operation
class Alpha1 {
    
    // Method to perform division and handle possible exception
    void alpha1() {
        // Print message indicating connection to the calculator
        System.out.println("Connection to calc is established");

        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Ask the user to enter the first number for division
        System.out.println("Enter num1 to divide:");
        int num1 = scan.nextInt();  // Read the first number from input

        // Ask the user to enter the second number for division
        System.out.println("Enter num2 to divide:");
        int num2 = scan.nextInt();  // Read the second number from input

        // Perform division and store the result
        // This can cause an ArithmeticException (e.g., division by zero)
        int res = num1 / num2;

        // Print the result of the division
        System.out.println("The result: " + res);

        // Print message indicating that the connection is terminated
        System.out.println("Connection is terminated");
    }
}

// Class Beta1 calls the method of Alpha1
class Beta1 {

    // Method to call alpha1() from Alpha1 class
    void beta1() {
        // Create an instance of Alpha1 class and call the alpha1 method
        Alpha1 a = new Alpha1();
        a.alpha1();
    }
}

// Main class to handle exception
public class Exception10 {
    
    public static void main(String[] args) {
        try {
            // Create an instance of Beta1 and call the beta1 method
            Beta1 b = new Beta1();
            b.beta1();
        } catch (ArithmeticException ae) {
            // Catch and handle ArithmeticException if division by zero occurs
            System.out.println("Exception finally handled in main");
        }
    }
}
