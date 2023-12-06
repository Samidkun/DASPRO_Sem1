import java.util.Scanner;

public class square {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of N: ");
            int N = sc.nextInt();
            
            // Outer loop for rows
            for (int i = 1; i <= N; i++) {
                // Inner loop for columns
                for (int j = 1; j <= N; j++) {
                    System.out.print("* ");
                }
                // Move to the next line after each row
                System.out.println();
            }
        }
    }
}
