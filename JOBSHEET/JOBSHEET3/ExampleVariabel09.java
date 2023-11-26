package ExampleVariable09;

/**
 * ExampleVariabel09
 */
public class ExampleVariabel09 {

    public static void main(String[] args) {
        String oneofmyhobbies = "playing video game";
        boolean isSmart = true;
        char gender = 'M';
        byte _age = 19;
        double $gpa =4.00, height = 1.73;
        System.out.println(oneofmyhobbies);
        System.out.println("are you smart ?" + isSmart);
        System.out.println("gender: "+gender);
        System.out.println("my current age is : " + _age);
        System.out.println(String.format("my GPA is %s and my height is %s meters", $gpa, height));
    }
}