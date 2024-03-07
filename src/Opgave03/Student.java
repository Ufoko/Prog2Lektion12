package Opgave03;

import java.util.List;

public class Student {

    private final int studentNo;
    private String name;
    private List<Integer> grades;


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
        int avg = 0;
        for (Integer grade : grades) {
            avg += grade;
        }
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
}
