import java.util.Scanner;
/**
 * star
 */
public class star {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of N: ");
            int N = sc.nextInt();
            for (int i = 1; i <= N; i++) {
                System.out.print("*");


            }
        }
    }
}