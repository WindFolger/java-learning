import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private String id;
    private String major;

    public Student(String id,String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.major = major;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    @Override
    public String toString() {
        return "Student{id='" + id + "', name='" + name + "', age=" + age + ", major='" + major + "'}";
    }
}
