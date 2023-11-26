import java.util.Scanner;

public class Selection2Exp109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("Leap year");
            } else if (year % 400 == 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
        } else {
            System.out.println("Not a leap year");
            input.close();
        }
    }
}
