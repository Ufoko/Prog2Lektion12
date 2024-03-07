package Opgave03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollegeTest {

    College haribo;
    Student ripStudent;

    @BeforeEach
    void setup() {
        haribo = new College("Haribo");
        ripStudent = new Student(0, "RIP");

        haribo.addStudent(ripStudent);
        haribo.addStudent(new Student(1, "Carl"));
        haribo.addStudent(new Student(2, "Hans"));
        haribo.addStudent(new Student(3, "Bo"));
        haribo.addStudent(new Student(4, "Børge"));
    }

    @Test
    void addStudent() {
        assertEquals(5, haribo.howManyStudents());
    }

    @Test
    void removeStudent() {
        haribo.removeStudent(0);
        assertEquals(4, haribo.howManyStudents());
    }

    @Test
    void findStudent() {
        assertEquals("Bo", haribo.findStudent(3).getName());
    }

    @Test
    void calcAverage() {
        for (Student student : haribo.getStudents().values()) {
            student.addGrade(3);
            student.addGrade(20);
        }

        assertEquals(11.5, haribo.calcAverage());

    }

}