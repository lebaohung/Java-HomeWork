package exe234;
import java.util.Scanner;
public class MainTestStudent {
    static Student student = new Student();
    static int choice;
    public static void main(String[] args) {
        MainTestStudent.displayMenu();
        choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                student.inputStudent();
                MainTestStudent.main(args);
                break;
            case 2:
                student.displayStudent();
                MainTestStudent.main(args);
                break;
            case 3:
                student.checkScholarship();
                MainTestStudent.main(args);
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Enter again: ");
        }
    }

    public static void displayMenu() {
        System.out.println("Menu");
        System.out.println("1.Input Student");
        System.out.println("2.Display Student");
        System.out.println("3.Check student scholarship");
        System.out.println("4.Exit");
        System.out.print("Enter your choice: ");
    }
}
