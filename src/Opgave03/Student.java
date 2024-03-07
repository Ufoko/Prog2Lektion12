package Opgave03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student>, Comparator<Student> {

    private final int studentNo;
    private String name;
    private List<Integer> grades = new ArrayList<Integer>();


    public Student(int studentNo, String name) {
        this.studentNo = studentNo;
        this.name = name;
    }


    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getAverage() {
        double avg = 0;
        for (Integer grade : grades) {
            avg += grade;
        }
        avg /= grades.size();
        return avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNo=" + studentNo +
                ", name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return studentNo - o.getStudentNo();
    }

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getName().compareTo(student2.getName());
    }
}
