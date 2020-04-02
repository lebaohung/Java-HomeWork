package exe234;
import java.util.Scanner;
public class Student extends Person {
    private int id;
    private double averageScore ;
    private String email;
    private boolean getScholarship;

    public Student() {
    }

    public Student(String name, String gender, int birth, String add, int id, double averageScore, String email) {
        super(name, gender, birth, add);
        this.id = id;
        this.averageScore = averageScore;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public boolean isGetScholarship() {
        return getScholarship;
    }

    public void setGetScholarship(boolean getScholarship) {
        this.getScholarship = getScholarship;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student name: ");
        this.setName(scanner.nextLine());
        System.out.print("Enter gender: ");
        this.setGender(scanner.nextLine());
        System.out.print("Enter birthday: ");
        this.setBirth(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter address: ");
        this.setAdd(scanner.nextLine());
        System.out.print("Enter Student ID: ");
        this.setId(scanner.nextInt());
        System.out.print("Enter Student's average score: ");
        this.setAverageScore(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Enter Student Email: ");
        this.setEmail(scanner.nextLine());
    }

    public void displayStudent() {
        System.out.printf("%-15s%-5s%-10d%-10s%-10d%-10.2f%-30s",this.getName(), this.getGender(), this.getBirth(), this.getAdd(),this.getId(), this.getAverageScore(), this.getEmail());
        System.out.println();
    }

    public void checkScholarship() {
        if (this.getAverageScore() > 8) {
            this.getScholarship = true;
            System.out.println("Student gets scholarship!");
        } else {
            System.out.println("Student does not get scholarship!");
        }
    }
}
