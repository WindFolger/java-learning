import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students;
    private Scanner scan;
    public StudentManager(){
        this.students=StudentUtil.loadFromFile();
        this.scan=new Scanner(System.in);
    }
    public void start(){
        while(true){showMenu();           // 显示菜单
            String choice = scan.nextLine();
            switch(choice){
                case "1" -> addStudent();
                case "2" -> updateStudent();
                case "3" -> deleteStudent();
                case "4" -> searchStudent();
                case "5" -> showAllStudents();
                case "0" -> {
                    StudentUtil.saveToFile(students);  // 退出时保存
                    System.out.println("Bye!");
                    return;
                   }
                default -> System.out.println("Invalid choice!");
            }

        }
    }
    private void showMenu(){
        System.out.println("=========Student Manager=========");
        System.out.println("1. Add Student");
        System.out.println("2. Update Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Search Student");
        System.out.println("5. show All Students");
        System.out.println("0. Exit");
        System.out.println("make your choice:");

    }
    private void addStudent(){
        System.out.println("Enter Student ID:");
        String id=scan.nextLine();
        if(findByid(id)!=null){
            System.out.println("Student already exists!");
            return;
        }
        System.out.println("Enter Student Name:");
        String name=scan.nextLine();
        System.out.println("Enter Student Age:");
        int age=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Student Major:");
        String major=scan.nextLine();
        Student student = new Student(id,name,age,major);
        students.add(student);
        System.out.println("Student added successfully!");
    }
    private void updateStudent(){
        System.out.println("Enter Student ID:");
        Student s=findByid(scan.nextLine());
        if(s==null){
            System.out.println("Student not found!");
            return;
        }
        System.out.println("Enter Student Name:"+s.getName());
        String name=scan.nextLine();
        System.out.println("Enter Student Age:"+s.getAge());
        int age=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Student Major:"+s.getMajor());
        String major=scan.nextLine();
        s.setName(name);
        s.setAge(age);
        s.setMajor(major);
        System.out.println("Student updated successfully!");
    }
    private void deleteStudent(){
        System.out.println("Enter Student ID:");
        Student s=findByid(scan.nextLine());
        if(s!=null){
            students.remove(s);
            System.out.println("Student deleted successfully!");
        }else {
            System.out.println("Student not found!");
        }
    }
    private void searchStudent(){
        System.out.println("Enter Student ID:");
        Student s=findByid(scan.nextLine());
        System.out.println(s != null?s:"Student not found!");
    }
    private void showAllStudents(){
        if(students.isEmpty()){
            System.out.println("Student list is empty!");
            return;
        }
        students.forEach(System.out::println);
    }


    private Student findByid(String id){
        return students.stream().filter(x->x.getId().equals(id)).findFirst().orElse(null);
    }
    public static void main(String[] args) {
        StudentManager sm=new StudentManager();
        sm.start();

    }

}