package java_hw_7_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student studentManager = new Student(0, "Manager", 0, 0.0);
        Student student = new Student(1, "Alisa", 19, 157);
        Student student1 = new Student(2, "Bogdan", 18, 168);
        Student student2 = new Student(3, "Igor", 20, 179);
        Student student3 = new Student(4, "Oksana", 21, 164);
        Student student4 = new Student(5, "Galina", 22, 192);

        student.addStudent(students);
        student1.addStudent(students);
        student2.addStudent(students);
        student3.addStudent(students);
        student4.addStudent(students);

        System.out.println("List with all students:");
        studentManager.printAllStudents(students);

        System.out.println();
        Student foundStudent = studentManager.findStudentByName(students, "Alisa");
        System.out.println("Found student in the list by name:");
        System.out.println(foundStudent);

        System.out.println();
        System.out.println("Student missing in the list by name:");
        Student notFoundStudent = studentManager.findStudentByName(students, "Miron");
        System.out.println(notFoundStudent);

        System.out.println();
        studentManager.removeStudentById(students, 1);
        System.out.println("All list after removing");
        studentManager.printAllStudents(students);


    }

}

