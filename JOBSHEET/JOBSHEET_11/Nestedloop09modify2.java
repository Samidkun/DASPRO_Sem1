import java.util.Scanner;

public class Nestedloop09modify2 {

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

        // Display temperatures and calculate average for each city
        System.out.println("\nTemperatures and Average:");
        for (int i = 0; i < temps.length; i++) {
            System.out.println("City " + i);
            double sum = 0;
            for (double temperature : temps[i]) {
                System.out.print(temperature + " ");
                sum += temperature;
            }
            double average = sum / temps[i].length;
            System.out.println("\nAverage: " + average + "\n");
        }
    }
}
