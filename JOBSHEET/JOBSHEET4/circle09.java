import java.util.Scanner;
/**
 * circle09
 */
public class circle09 {

    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);
        int r;
        double circumference, area;
        System.out.println("input radius");
        r = input.nextInt();
        area = 3.14*r*r;
        circumference = 2*3.14*r;
        System.out.println("Area "+area);
        System.out.println("Circumference" +circumference);
    }
}