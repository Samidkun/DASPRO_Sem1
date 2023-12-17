import java.util.Scanner;

public class ExpressingGratitude_09 {

    public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of the person you want to greet: ");
        String recipientName = input.nextLine();
        // Don't close the Scanner here to allow using System.in later
        return recipientName;
    }

    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you for being the best teacher in the world by samid.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void main(String[] args) {
        sayThankyou();
        // Close the Scanner when you're done using it
        // This should be done in the main method, not in getGreetingRecipient()
        Scanner input = new Scanner(System.in);
        input.close();
    }
}
