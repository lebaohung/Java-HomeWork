package exe1;
import javax.lang.model.element.NestingKind;
import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private int birth;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, int birth, String address) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getBirth() {
        return birth;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter new name: ");
        this.setName(scanner.nextLine());
        System.out.print("Enter gender: ");
        this.setGender(scanner.nextLine());
        System.out.print("Enter birthday (ddmmyy) :");
        this.setBirth(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Enter address: ");
        this.setAddress(scanner.nextLine());
    }

    public void displayPerson() {
        System.out.printf("%-20s%-10s%-10d%-50s", this.getName(), this.getGender(), this.getBirth(), this.getAddress());
        System.out.println();
    }

}
