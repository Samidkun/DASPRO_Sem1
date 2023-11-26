package BANK09;

/**
 * Bank09
 */
import java.util.Scanner;
public class Bank09 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int init_sav_amount, sav_period;
            double final_sav_amount, interest, interest_percent = 0.02;
            System.out.print("input your initial saving amount: ");
            init_sav_amount = sc.nextInt();
            System.out.print("input your saving period: ");
            sav_period = sc.nextInt();
            interest = sav_period * interest_percent + init_sav_amount;
            final_sav_amount = interest + init_sav_amount;
            System.out.println("Interest:"+ interest);
            System.out.println("final saving amount:"+ final_sav_amount);
        }
    }

}