import java.util.Scanner;

public class WhileMultiples09 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int multiple, sum = 0, counter = 0; 
            double average; 
            System.out.print("Input the multiple = ");
            multiple = input.nextInt();

            int i = 1; 

            while (i <= 50) {
                if (i % multiple == 0) {
                    sum = sum + i;
                    counter++;
                }
                i++; 
            }

            
            if (counter > 0) {
                average = (double) sum / counter;
            } else {
                average = 0; 
            }

            System.out.printf("There are %d numbers that are multiples of %d in the range 1 to 50. \n", counter, multiple);
            System.out.printf("The sum of all multiples of %d in the range 1 to 50 is %d. \n", multiple, sum);
            System.out.printf("The average of all multiples of %d in the range 1 to 50 is %.2f. \n", multiple, average);
        }
    }
}
