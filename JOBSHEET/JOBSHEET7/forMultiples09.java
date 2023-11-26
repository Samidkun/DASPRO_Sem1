import java.util.Scanner;

public class forMultiples09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiple, sum = 0, counter = 0; // Initialize sum and counter
        double average; // Initialize the new variable for the average
        System.out.print("Input the multiple = ");
        multiple = input.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
        }

        // Calculate the average
        if (counter > 0) {
            average = (double) sum / counter;
        } else {
            average = 0; // Avoid division by zero
        }

        System.out.printf("There are %d numbers that are multiples of %d in the range 1 to 50. \n", counter, multiple);
        System.out.printf("The sum of all multiples of %d in the range 1 to 50 is %d. \n", multiple, sum);
        System.out.printf("The average of all multiples of %d in the range 1 to 50 is %.2f. \n", multiple, average);
    }
}
