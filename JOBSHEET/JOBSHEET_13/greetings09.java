import java.util.Scanner;
/**
 * greetings09
 */
public class greetings09 {

    public static String getgreetingRecipient(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet :");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }
    public static void main(String[] args) {
        String name = getgreetingRecipient();
        System.out.println("Thank you "+name+"\tmay the force be with you!");
    }
}