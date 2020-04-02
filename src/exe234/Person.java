package exe234;

public class Person {
    private String name;
    private String gender;
    private int birth;
    private String add;

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public int getBirth() {
        return birth;
    }

    public String getAdd() {
        return add;
    }

    public Person() {
    }

    public Person(String name, String gender, int birth, String add) {
        this.name = name;
        this.gender = gender;
        this.birth = birth;
        this.add = add;
    }
}
