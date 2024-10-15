import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for number of rows and columns
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();

        // Initialize matrices
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];
        int[][] s = new int[r][c];

        // Input elements for first matrix
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input elements for second matrix
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Display first matrix
        System.out.println("First Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Display second matrix
        System.out.println("Second Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        // Menu-driven operations
        int ch;
        do {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Transpose of the first matrix");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    // Matrix addition
                    System.out.println("Matrix Addition:");
                    for (int i = 0; i < r; i++) {
                        for (int j = 0; j < c; j++) {
                            System.out.print((a[i][j] + b[i][j]) + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // Matrix multiplication
                    System.out.println("Matrix Multiplication:");
                    if (r == c) {
                        for (int i = 0; i < r; i++) {
                            for (int j = 0; j < c; j++) {
                                s[i][j] = 0;
                                for (int k = 0; k < r; k++) {
                                    s[i][j] += a[i][k] * b[k][j];
                                }
                            }
                        }
                        for (int i = 0; i < r; i++) {
                            for (int j = 0; j < c; j++) {
                                System.out.print(s[i][j] + " ");
                            }
                            System.out.println();
                        }
                    } else {
                        System.out.println("Matrix multiplication not possible for non-square matrices.");
                    }
                    break;

                case 3:
                    // Transpose of the first matrix
                    System.out.println("Transpose of the First Matrix:");
                    for (int i = 0; i < c; i++) {
                        for (int j = 0; j < r; j++) {
                            System.out.print(a[j][i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (ch != 4);

        sc.close();
    }
}
