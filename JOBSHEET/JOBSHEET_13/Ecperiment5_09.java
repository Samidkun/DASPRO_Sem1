/**
 * Ecperiment5_09
 */
public class Ecperiment5_09 {
    static void show (String str, int...a) {
        System.out.println("String :  " + str);
        System.out.println("Number of argument/parameters: " + a.length);

            for (int i : a) {
                System.out.print(i + "  ");

            }
            System.out.println();
        
    }
    public static void main(String[] args) {
        show("Programming Fundamental 2023", 100,200);
        show("Information Technology",1, 2, 3, 4, 5);
        show("Informatics");
    }
}