import java.util.Scanner;

public class arrayvalue09 {
 
    public static void main(String[] args) {
        int[] finalScore = new int[10];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Enter the final score " + i + ": ");
                finalScore[i] = sc.nextInt();
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Final score " + i + " is " + finalScore[i]);
        }
    }
}
