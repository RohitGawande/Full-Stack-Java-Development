import java.util.Scanner;

class Alpha2 {
    // This method declares that it might throw an ArithmeticException
    void alpha2() throws ArithmeticException {
        // Connection to calculator application
        System.out.println("Connection to calc is established");

        // Taking input from the console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1 to divide:");
        int num1 = scan.nextInt();

        System.out.println("Enter num2 to divide:");
        int num2 = scan.nextInt();

        // Risky operation: Division that might throw ArithmeticException (if num2 == 0)
        int res = num1 / num2;
        System.out.println("The result: " + res);

        // Terminating the connection
        System.out.println("Connection is terminated");
    }
}

class Beta2 {
    // This method declares that it might throw an ArithmeticException
    void beta2() throws ArithmeticException {
        Alpha2 a = new Alpha2();
        a.alpha2();  // Call to alpha2, which may throw an exception
    }
}

public class Exception11 {
    public static void main(String[] args) {
        try {
            Beta2 b = new Beta2();
            b.beta2();  // Call to beta2, which may propagate the exception
        } catch (ArithmeticException ae) {
            // Handling the exception in the main method
            System.out.println("Exception finally handled in main");
        }
    }
}