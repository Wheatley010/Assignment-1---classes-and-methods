package models;

import java.util.ArrayList;

public class Student extends Person {
    int studentID;
    static int idCounter = 1;
    ArrayList<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = idCounter++;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGPA() {
        int sum = 0;
        for (int grade : grades) sum += grade;
        return grades.size() == 0 ? 0.0 : sum / (double) grades.size();
    }

    public String toString() {
        return super.toString() + " I am a student with ID " + studentID + ".";
    }
}




