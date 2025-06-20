import java.util.Scanner;

class Alpha {
    void alpha() {
        System.out.println("Connection to calc is established");

        // Taking input from console
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter num1 to divide:");
        int num1 = scan.nextInt();

        System.out.println("Enter num2 to divide:");
        int num2 = scan.nextInt();

        // Division operation that may cause an exception
        int res = num1 / num2;  // Division by zero exception if num2 = 0
        System.out.println("The result: " + res);

        System.out.println("Connection is terminated");
    }
}

public class Exception9 {
    public static void main(String[] args) {
        Alpha a = new Alpha();
        a.alpha();  // Calling alpha method
    }
}