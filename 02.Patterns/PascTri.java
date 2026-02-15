public class PascTri {
    public static void main(String[] args) {
        int rows = 6; // number of rows you want to print

        for (int i = 0; i < rows; i++) {
            // Print leading spaces for pyramid shape
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }

            int num = 1; // first element of each row is always 1
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                // Update value using formula: nCr = nCr-1 * (i - j) / (j + 1)
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
