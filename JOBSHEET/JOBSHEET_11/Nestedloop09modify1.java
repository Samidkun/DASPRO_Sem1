import java.util.Scanner;

public class Nestedloop09modify1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temps = new double[5][7];

        // Input temperatures
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City " + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
        }

        // Display temperatures using foreach loop
        System.out.println("\nTemperatures:");
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City " + i);
            for (double temperature : temps[i]) {
                System.out.print(temperature + " ");
            }
            System.out.println(); // Move to the next line after displaying each city's temperatures
        }
    }
}
