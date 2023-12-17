import java.util.Scanner;

public class ManageTheWeeklyGrades09modify {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students from the user
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Get the number of weeks from the user
        System.out.print("Enter the number of weeks: ");
        int numWeeks = scanner.nextInt();

        // Create a 2D array to store weekly grades for each student
        double[][] grades = new double[numStudents][numWeeks];

        // Input weekly grades for each student
        for (int student = 0; student < numStudents; student++) {
            System.out.println("Enter weekly grades for Student " + (student + 1) + ":");
            for (int week = 0; week < numWeeks; week++) {
                System.out.print("Week " + (week + 1) + ": ");
                grades[student][week] = scanner.nextDouble();
            }
        }

        // Display weekly grades for each student
        System.out.println("\nWeekly Grades:");
        for (int student = 0; student < numStudents; student++) {
            System.out.print("Student " + (student + 1) + ": ");
            for (int week = 0; week < numWeeks; week++) {
                System.out.print(grades[student][week] + " ");
            }
            System.out.println(); // Move to the next line for the next student
        }

        // Close the scanner when done
        scanner.close();
    }
}
