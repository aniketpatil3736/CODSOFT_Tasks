import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Student Grade Calculator");
        System.out.println("Enter number of Subjects:");
        int ns = sc.nextInt(); // Changed nS to ns for consistency
        
        int total = 0;
        
        for (int i = 1; i <= ns; i++) { // Changed loop condition to start from 1
            System.out.println("Enter marks obtained in subject " + i + ":");
            int marks = sc.nextInt();
            total += marks;
        }
        
        double averP = (double) total / ns; // Changed averp to averP
        
        char grade;
        if (averP >= 90) {
            grade = 'O';
        } else if (averP >= 80) {
            grade = 'A';
        } else if (averP >= 70) {
            grade = 'B';
        } else if (averP >= 60) {
            grade = 'C';
        } else if (averP >= 50) {
            grade = 'D';
        } else if (averP >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }
        
        System.out.println("Total Marks Scored: " + total);
        System.out.println("Average Percentage Gained: " + String.format("%.2f", averP) + "%");
        System.out.println("Grade: " + grade);
    }
}






