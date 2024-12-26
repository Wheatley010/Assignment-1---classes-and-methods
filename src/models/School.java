package models;

import java.util.ArrayList;

public class School {
    ArrayList<Person> members;

    public School() {
        members = new ArrayList<>();
    }

    public void addMember(Person person) {
        members.add(person);
    }

    public ArrayList<Person> getMembers() {
        return members;
    }

    public String toString() {
        String result = "";
        for (Person member : members) result += member.toString() + "\n";
        return result;
    }
}



