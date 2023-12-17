import java.util.Scanner;

public class cube09 {

    public static double hitungLuasKubus(double sisi) {
        return 6 * sisi * sisi; // Formula for surface area of a cube: 6 * side * side
    }

    public static double hitungVolumeKubus(double sisi) {
        return sisi * sisi * sisi; // Formula for volume of a cube: side * side * side
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();

        // Menghitung Luas kubus
        double luas = hitungLuasKubus(sisi);
        System.out.println("Luas kubus: " + luas);

        // Menghitung volume kubus
        double volume = hitungVolumeKubus(sisi);
        System.out.println("Volume kubus: " + volume);

        // Close the scanner when done
        scanner.close();
    }
}
