package exe1;
import java.util.Scanner;
public class Main {
    static Person person = new Person();
    static int choice;
    public static void main(String[] args) {
        Main.displayMenu();
        choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                person.inputPerson();
                Main.main(args);
                break;
            case 2:
                person.displayPerson();
                Main.main(args);
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid choice! Choose again: ");
        }
    }

    public static void displayMenu() {
        System.out.println("Menu");
        System.out.println("1.Input data");
        System.out.println("2.Display data");
        System.out.println("3.Exit");
        System.out.print("Enter your choice: ");
    }
}
