package exe234;
import java.util.*;

public class StudentManager {
    ArrayList<Student> listStudent = new ArrayList<Student>();

    public void addStudent() {
        Student student = new Student();
        student.inputStudent();
        listStudent.add(student);
    }

    public void displayStudentsList() {
        for (int i = 0; i < listStudent.size(); i++) {
            listStudent.get(i).displayStudent();
        }
    }

    public void deleteByID(int id) {
        boolean checkID = false;
        for (int i = 0; i< listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id){
                listStudent.remove(i);
                checkID = true;
            }
        }
        if (checkID) {
            System.out.println("Invalid ID / Not Found!");
        }
    }

    public void editByID(int id) {
        boolean checkID = false;
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                listStudent.get(i).inputStudent();
            }
        }
        if (checkID) {
            System.out.println("Invalid ID / Not Found!");
        }
    }

    public void findByID(int id) {
        boolean checkID = false;
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                listStudent.get(i).displayStudent();
                checkID = true;
            }
        }
        if (checkID) {
            System.out.println("Invalid ID / Not Found!");
        }
    }

    public void findByName(String name) {
        boolean checkName = false;
        for (int i = 0; i < listStudent.size(); i++) {
            if (name.equals(listStudent.get(i).getName())) {
                listStudent.get(i).displayStudent();
                checkName = true;
            }
        }
        if (checkName) {
            System.out.println("Invalid ID / Not Found!");
        }
    }

    public void displayScholarship() {
        boolean check = false;
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getAverageScore() > 8) {
                listStudent.get(i).displayStudent();
            }
        }
        if (check) {
            System.out.println("No one get scholarship");
        }
    }
}
