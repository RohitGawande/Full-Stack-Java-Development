package Pattern;

public class Print_X { // Corrected the class name to follow Java naming conventions

    public static void main(String[] args) {
        int n = 9; // Size of the X pattern (should be an odd number for symmetry)

        // Loop through each row
        for (int i = 0; i < n; i++) {
            // Loop through each column in the row
            for (int j = 0; j < n; j++) {
                // Print '*' when the row and column indexes are equal (diagonal) or when the sum equals n-1 (reverse diagonal)
                if (i == j || i + j == n - 1) {
                    System.out.print("*");
                } else {
                    // Print space for the rest of the pattern
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing all columns in the current row
            System.out.println();
        }
    }
}
