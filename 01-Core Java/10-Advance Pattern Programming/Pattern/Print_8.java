package Pattern;

public class Print_8 {

    public static void main(String[] args) {
        int n = 5; // Size of the pattern (it works best with an odd number)

        // Loop through each row
        for (int i = 0; i < n; i++) {
            // Loop through each column in the row
            for (int j = 0; j < n; j++) {
                // Print '*' for the top row, bottom row, first column, last column, or middle row
                if (i == 0 || i == n - 1 || j == 0 || j == n - 1 || i == n / 2) {
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
