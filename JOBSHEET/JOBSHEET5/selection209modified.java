import java.util.Scanner;

public class selection209 {

    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        System.out.println("Nilai uas   : ");
        float finalExam = input05.nextFloat();
        System.out.println("nilai uts   : " );
        float midExam = input05.nextFloat();
        System.out.println("nilai kuis  : " );
        float quiz = input05.nextFloat();
        System.out.println("nilai tugas : ");
        float assignment = input05.nextFloat();

        float total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assignment * 0.2F);

        System.out.println("Final Grade = " + total);
        
        // Convert numerical grade to letter grade
        String letterGrade;
        if (total >= 90) {
            letterGrade = "A";
        } else if (total >= 80) {
            letterGrade = "B";
        } else if (total >= 70) {
            letterGrade = "C";
        } else if (total >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        System.out.println("Letter Grade = " + letterGrade);
    }
}
