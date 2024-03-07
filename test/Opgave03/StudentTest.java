package Opgave03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student1;
    Student student2;
    Student student3;
    Student student4;

    @BeforeEach
    void setup() {
        student1 = new Student(0, "Carl");
        student2 = new Student(1, "las");
        student3 = new Student(2, "annie");
        student4 = new Student(3, "børge");
    }

    @Test
    void compareTo() {
        student1.com


    }


    @Test
    void addGrade() {
    }

    @Test
    void setName() {
    }

    @Test
    void getStudentNo() {
    }

    @Test
    void getName() {
    }

    @Test
    void getGrades() {
    }

    @Test
    void getAverage() {
    }


}