import java.util.Scanner;
/**
 * salary09
 */
public class salary09 {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int numAttendance,numAbsence, totalSalary;
      int salary=40000, salaryDeduction=25000;
      System.out.print("input attendance number: ");
     numAttendance = input.nextInt();
      System.out.println("input absence number: ");
      numAbsence = input.nextInt();
      totalSalary=(numAttendance*salary)-(numAbsence*salaryDeduction);
      System.out.println("Total salary: "+totalSalary);  
    }
}