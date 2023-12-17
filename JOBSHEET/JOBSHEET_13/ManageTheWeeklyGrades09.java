import java.util.Scanner;

public class ManageTheWeeklyGrades09 {

    public static void main(String[] args) {
        final int NUM_STUDENTS = 5;
        final int NUM_WEEKS = 7;
        double[][] grades = new double[NUM_STUDENTS][NUM_WEEKS];

        Scanner scanner = new Scanner(System.in);
        for (int student = 0; student < NUM_STUDENTS; student++) {
            System.out.println("Enter weekly grades for Student " + (student + 1) + ":");
            for (int week = 0; week < NUM_WEEKS; week++) {
                System.out.print("Week " + (week + 1) + ": ");
                grades[student][week] = scanner.nextDouble();
            }
        }
        System.out.println("\nWeekly Grades:");
        for (int student = 0; student < NUM_STUDENTS; student++) {
            System.out.print("Student " + (student + 1) + ": ");
            for (int week = 0; week < NUM_WEEKS; week++) {
                System.out.print(grades[student][week] + " ");
            }
            System.out.println(); 
        }
        scanner.close();
    }
}
