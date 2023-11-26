/**
 * PurchasePrice09modified
 */
import java.util.Scanner;
public class PurchasePrice09modified {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int price, quality;
            double discount=0.1, totalPrice, purchasePrice, totalDiscount;
            System.out.print("Input name of book: ");
            input.nextLine();
            System.out.print("Input page count: ");
            input.nextLine();
            System.out.print("Input price: ");
            price = input.nextInt();
            System.out.print("Input quality ");
            quality = input.nextInt();
            totalPrice = price*quality;
            totalDiscount = totalPrice*discount;
            purchasePrice = totalPrice-totalDiscount;
            System.out.print("Total discount " + totalDiscount);
            System.out.print("Final purchase price " + purchasePrice);

        }
    }

 }