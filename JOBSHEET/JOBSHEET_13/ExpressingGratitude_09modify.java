import java.util.Scanner;

public class ExpressingGratitude_09modify {

    public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of the person you want to greet: ");
        String recipientName = input.nextLine();
        return recipientName;
    }
    public static void sayThankyou(String name) {
        System.out.println("Thank you for being the best teacher in the world, " + name + ".\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything.");
    }
    public static void sayAdditionalGreetings(String additionalGreetings) {
        System.out.println("Additional Greetings: " + additionalGreetings);
    }
    public static void main(String[] args) {
        String name = getGreetingRecipient();
        sayThankyou(name);
        System.out.println("I appreciate your dedication to education and your positive impact on my life.");
        Scanner input = new Scanner(System.in);
        input.close();
    }
}
