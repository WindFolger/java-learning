import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students;
    private Scanner scan;
    public StudentManager() {
        this.students = StudentUtil.loadFile();
        this.scan = new Scanner(System.in);
    }
    public void start() {
        while (true) {showMenu();
            String choice = scan.nextLine();
            switch (choice) {
                case "1":addStudent(); break;
                case "2":deleteStudent(); break;
                case "3":updateStudent(); break;
                case "4":findStudent(); break;
                case "5":showStudents(); break;
                case "0":{
                    StudentUtil.saveFile(students);
                    return;
                }
                default:break;
            }
        }
    }
    private void showMenu(){
        System.out.println("=========Student Manager=========");
        System.out.println("1. Add Student");
        System.out.println("2.Delete Studen ");
        System.out.println("3. tUpdate Student");
        System.out.println("4. Search Student");
        System.out.println("5. show All Students");
        System.out.println("0. Exit");
        System.out.println("make your choice:");

    }
    private  void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = scan.nextLine();
        if(Findid(id)!=null) {
            System.out.println("Student ID already exists!");
            return;
        }
        System.out.print("Enter Student Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Student Age: ");
        int Age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Student Major: ");
        String major = scan.nextLine();
        Student st=new Student(name,Age,id,major);
        students.add(st);
        System.out.println("Student added!");

    }
    private  void updateStudent() {
        System.out.print("Enter Student ID: ");
        Student s=Findid(scan.nextLine());
        if(s==null) {
            System.out.println("Student ID not found!");
            return;
        }
        System.out.print("Enter Student Name: "+s.getName()+"\n");
        String name = scan.nextLine();
        System.out.print("Enter Student Age: "+s.getAge()+"\n");
        int Age = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Student Major: "+s.getMajor()+"\n");
        String major = scan.nextLine();
        s.setMajor(major);
        s.setAge(Age);
        s.setName(name);
        System.out.println("Student updated!");

    }
    private  void deleteStudent() {
        System.out.print("Enter Student ID: ");
        String id = scan.nextLine();
        if(Findid(id)!=null) {
            students.remove(Findid(id));
            System.out.println("Student deleted!");
        }else  {
            System.out.println("Student ID not found!");
        }
    }
    private void findStudent() {
        System.out.print("Enter Student ID: ");
        String id = scan.nextLine();
        if(Findid(id)!=null) {
            System.out.println("Student found!"+Findid(id));
        }else  {
            System.out.println("Student ID not found!");
        }
    }
    private void showStudents() {
        if(students.isEmpty()) {
            System.out.println("Student list is empty!");
            return;
        }
        students.forEach(System.out::println);
    }

    private Student Findid (String id) {
        return students.stream().filter(x->x.getId().equals(id)).findFirst().orElse(null);
    }
    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.start();
    }
}
