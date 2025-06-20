package Patterns;

public class Print_A {

    public static void main(String[] args) {
        int n = 17; // Height of the letter A; should be an odd number for symmetry

        // Loop through each row
        for (int i = 0; i < n; i++) {
            // Loop through each column in the row
            for (int j = 0; j < n; j++) {
                // Print '*' based on specific conditions to form the letter 'A'
                if ((j == 0 && i != 0) || // Left vertical line
                    (i == 0 && j != 0 && j < (n - 1) / 2) || // Top horizontal line
                    (i == (n - 1) / 2 && j <= (n - 1) / 2) || // Middle horizontal line
                    (j == (n - 1) / 2 && i != 0)) { // Right vertical line
                    System.out.print("*");
                } else {
                    // Print space for the inner cells
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing all columns in the current row
            System.out.println();
        }
    }
}
