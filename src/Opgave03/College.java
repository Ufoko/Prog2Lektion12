package Opgave03;

import java.util.*;

public class College {
    private String name;
    private Map<Integer, Student> students = new LinkedHashMap<Integer, Student>();

    public void addStudent(Student student) {
        students.put(student.getStudentNo(), student);
    }

    public int howManyStudents() {
        return students.size();
    }

    public Map<Integer, Student> getStudents() {
        return students;
    }

    public void removeStudent(Integer studentNo) {
        students.remove(studentNo);
    }

    public Student findStudent(int studentNo) {

        for (Student student : students.values()) {
            if (student.getStudentNo() == studentNo) {
                return student;
            }
        }
        return null;
    }

    public double calcAverage() {
        double averageGrade = 0;
        for (Student student : students.values()) {
            averageGrade += student.getAverage();
            System.out.println(averageGrade);
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
