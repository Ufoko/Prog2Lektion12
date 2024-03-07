package Opgave03;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;

public class College {
    private String name;
    private List<Student> students = new ArrayList<Student>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Student findStudent(int studentNo) {
        for (Student student : students) {
            if (student.getStudentNo() == studentNo) {
                return student;
            }
        }
        return null;
    }

    public double calcAverage() {
        int averageGrade = 0;
        for (Student student : students) {
            averageGrade += student.getAverage();
        }
        averageGrade /= students.size();
        return averageGrade;
    }

    public College(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
