package models;

public class Teacher extends Person {
    String subject;
    int yearsOfExperience, salary;

    public Teacher(String name, String surname, int age, boolean gender, String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }

    public void giveRaise(int percentage) {
        salary += salary * percentage / 100;
    }

    public String toString() {
        return super.toString() + " I teach " + subject + ".";
    }
}




