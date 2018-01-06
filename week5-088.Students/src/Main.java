
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;
        String studentNum;
        // write here the main program
        ArrayList<Student> studentList = new ArrayList<Student>();


        while(true){
            System.out.print("name: ");
            name = reader.nextLine();
            if(name.equals("")){
                break;
            }

            System.out.print("studentnumber: ");
            studentNum = reader.nextLine();



            Student newStudent = new Student(name, studentNum);
            studentList.add(newStudent);

        }

        for(Student stu : studentList){
            System.out.println(stu.getName() + " (" + stu.getStudentNumber() + ")");
        }

        System.out.print("Give search term: ");
        String search = reader.nextLine();

        System.out.println("Result: ");
        for(Student stu : studentList){
            if (stu.getName().contains(search)){
                System.out.println(stu.getName() + " (" + stu.getStudentNumber() + ")");
            }
        }


    }
}
