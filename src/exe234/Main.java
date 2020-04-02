package exe234;
import java.util.*;
public class Main {
//    static Student student = new Student();
    static StudentManager studentManager = new StudentManager();
    static int choice;
    public static void main(String[] args) {
        Main.displayMenu();
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        int id;
        switch (choice) {
            case 1:
                studentManager.addStudent();
                Main.main(args);
                break;
            case 2:
                studentManager.displayStudentsList();
                Main.main(args);
                break;
            case 3:
                System.out.println("Enter id: ");
                id = scanner.nextInt();
                studentManager.editByID(id);
                Main.main(args);
                break;
            case 4:
                System.out.println("Enter id: ");
                id = scanner.nextInt();
                studentManager.deleteByID(id);
                Main.main(args);
                break;
            case 5:
                System.out.println("Enter id: ");
                id = scanner.nextInt();
                studentManager.findByID(id);
                Main.main(args);
                break;
            case 6:
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                studentManager.findByName(name);
                Main.main(args);
                break;
            case 7:
                studentManager.displayStudentsGetScholarship();
                Main.main(args);
                break;
            case 8:
                studentManager.findFemaleStudent();
                Main.main(args);
                break;
            case 9:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!  ");
        }
    }

    public static void displayMenu() {
        System.out.println("Menu");
        System.out.println("1.Input Student");
        System.out.println("2.Display Student list");
        System.out.println("3.Edit by Student ID");
        System.out.println("4.Delete by Student ID");
        System.out.println("5.Find by ID");
        System.out.println("6.Find by name");
        System.out.println("7.Display Students getting Scholarship");
        System.out.println("8.Display female Students ");
        System.out.println("9.Exit");
        System.out.print("Enter your choice: ");
    }
}
