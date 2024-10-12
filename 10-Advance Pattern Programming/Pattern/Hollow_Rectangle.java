// Java program to print a hollow rectangle
public class Hollow_Rectangle {
    public static void main(String[] args) {
        // Define the dimensions of the rectangle
        int rows = 5; // number of rows
        int columns = 10; // number of columns

        // Loop through each row
        for (int i = 1; i <= rows; i++) {
            // Loop through each column in the row
            for (int j = 1; j <= columns; j++) {
                // Print '*' for the first and last row or first and last column
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    // Print space for inner cells of the rectangle
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing all columns in the current row
            System.out.println();
        }
    }
}
