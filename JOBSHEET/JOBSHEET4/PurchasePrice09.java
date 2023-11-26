/**
 * PurchasePrice09
 */
import java.util.Scanner;
public class PurchasePrice09 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner (System.in)) {
            int price, quantity;
            double discount=0.1, totalPrice, purchasePrice, totalDiscount;
            System.out.println("input price: ");
            price=input.nextInt();
            System.out.println("input quality: ");
            quantity=input.nextInt();
            totalPrice=price*quantity;
            totalDiscount=totalPrice*discount;
        System.out.println("Total discount: "+totalDiscount);
        System.out.println("Final purchase price: ");
        }
    }
}