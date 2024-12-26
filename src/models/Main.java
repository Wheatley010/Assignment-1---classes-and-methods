package models;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        School school = new School();

        try {
            Scanner studentScanner = new Scanner(new File("src/models/students.txt"));
            while (studentScanner.hasNextLine()) {
                String[] parts = studentScanner.nextLine().split(" ");
                Student student = new Student(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3].equals("Male"));
                for (int i = 4; i < parts.length; i++) student.addGrade(Integer.parseInt(parts[i]));
                school.addMember(student);
            }
            studentScanner.close();
        } catch (IOException e) {
            System.out.println("Error reading students.txt");
        }

        try {
            Scanner teacherScanner = new Scanner(new File("src/models/teachers.txt"));
            while (teacherScanner.hasNextLine()) {
                String[] parts = teacherScanner.nextLine().split(" ");
                Teacher teacher = new Teacher(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3].equals("Male"), parts[4], Integer.parseInt(parts[5]), Integer.parseInt(parts[6]));
                if (teacher.yearsOfExperience > 10) teacher.giveRaise(10);
                school.addMember(teacher);
            }
            teacherScanner.close();
        } catch (IOException e) {
            System.out.println("Error reading teachers.txt");
        }

        System.out.println("School members:");
        System.out.println(school);

        for (Person member : school.getMembers()) {
            if (member instanceof Student) {
                Student student = (Student) member;
                System.out.println(student + " GPA: " + student.calculateGPA());
            } else if (member instanceof Teacher) {
                Teacher teacher = (Teacher) member;
                System.out.println(teacher + " Salary: " + teacher.salary);
            }
        }
    }
}




