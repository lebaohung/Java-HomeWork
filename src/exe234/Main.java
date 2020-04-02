package exe234;
import java.util.*;
public class Main {
    static Student student = new Student();

    static int choice;
    public static void main(String[] args) {
        Main.displayMenu();
        choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                student.inputStudent();
                Main.main(args);
                break;
            case 2:
                student.displayStudent();
                Main.main(args);
                break;
            case 3:
                student.checkScholarship();
                Main.main(args);
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
        System.out.println("2.Display Student list");
        System.out.println("3.Check student scholarship");
        System.out.println("4.Edit by Student ID");
        System.out.println("5.Delete by Student ID");
        System.out.println("6.Find by ID");
        System.out.println("7.Find by name");
        System.out.println("8.Display Students getting Scholarship");
        System.out.println("9.Display female Students ");
        System.out.println("5.Exit");
        System.out.print("Enter your choice: ");
    }
}
