import java.util.Scanner;

public class DoWhileLeaveEntitlement09 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leaveEntitlement, numLeave;
        String confirmation;
        int jatahCuti, jumlahHari;
        int konfirmasi;

        System.out.print("Jatah cuti: ");
        jatahCuti = input.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            confirmation = input.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                jumlahHari = input.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                    break;
                }
            } else {
                break;
            }
        } while (jatahCuti > 0);

        input.close(); // Close the Scanner when you're done using it
    }
}
