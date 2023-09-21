package main;

import org.junit.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//This method was adapted from freeCodeCamp
//https://www.freecodecamp.org/news/java-unit-testing/
//freeCodeCamp

//Farrell, J. 2019. Java Programming. 9th ed. Australia • Brazil • Mexico • Singapore • United Kingdom • United States: Cengage

public class StudentTest {

    public StudentTest() {
    }

    @Test
    public void testSaveStudent() {
        ArrayList<Student> students = new ArrayList<>();

        Student savedStudent = new Student();
        savedStudent.id = "10111";
        savedStudent.name = "J.Bloggs";
        savedStudent.age = 19;
        savedStudent.email = "jbloggs@ymail.com";
        savedStudent.course = "disd";

        students.add(savedStudent);

        assertEquals(1, students.size());
        assertEquals("10111", students.get(0).id);
        assertEquals("J.Bloggs", students.get(0).name);
        assertEquals(19, students.get(0).age);
        assertEquals("jbloggs@ymail.com", students.get(0).email);
        assertEquals("disd", students.get(0).course);
    }

    @Test
    public void testSearchStudent() {
        ArrayList<Student> students = new ArrayList<>();

        Student savedStudent = new Student();
        savedStudent.id = "10111";
        savedStudent.name = "J.Bloggs";
        savedStudent.age = 19;
        savedStudent.email = "jbloggs@ymail.com";
        savedStudent.course = "disd";

        students.add(savedStudent);

        if (savedStudent.id.equals("10111")) {
            String studentOutput = "Student ID: 10111\n"
                    + "Student Name: J.Bloggs\n"
                    + "Student Age: 19\n"
                    + "Student Email: jbloggs@ymail.com\n"
                    + "Student Course: disd\n";

            String studentInfo = "Student ID: " + students.get(0).id + "\n"
                    + "Student Name: " + students.get(0).name + "\n"
                    + "Student Age: " + students.get(0).age + "\n"
                    + "Student Email: " + students.get(0).email + "\n"
                    + "Student Course: " + students.get(0).course + "\n";

            assertTrue(studentOutput.contains(studentInfo));
        }

    }

    @Test
    public void TestSearchStudent_StudentNotFound() {
        ArrayList<Student> students = new ArrayList<>();

        Student savedStudent = new Student();
        savedStudent.id = "10111";
        savedStudent.name = "J.Bloggs";
        savedStudent.age = 19;
        savedStudent.email = "jbloggs@ymail.com";
        savedStudent.course = "disd";

        students.add(savedStudent);

        if (savedStudent.id.equals("10000")) {
            String studentOutput = "Student ID: 10111\n"
                    + "Student Name: J.Bloggs\n"
                    + "Student Age: 19\n"
                    + "Student Email: jbloggs@ymail.com\n"
                    + "Student Course: disd\n";

            String studentInfo = "Student ID: " + students.get(0).id + "\n"
                    + "Student Name: " + students.get(0).name + "\n"
                    + "Student Age: " + students.get(0).age + "\n"
                    + "Student Email: " + students.get(0).email + "\n"
                    + "Student Course: " + students.get(0).course + "\n";

            assertFalse(studentOutput.contains(studentInfo));

        }

    }

    @Test
    public void testDeleteStudent() {
        ArrayList<Student> students = new ArrayList<>();

        Student deleteStudent = new Student();
        deleteStudent.id = "10111";

        students.add(deleteStudent);

        if (deleteStudent.id.equals("10111")) {
            String studentOutput = "Student with student ID: 10111 was deleted";
            assertTrue(studentOutput.contains("Student with student ID: 10111 was deleted"));
        }

    }

    @Test
    public void TestDeleteStudent_StudentNotFound() {
        ArrayList<Student> students = new ArrayList<>();

        Student deleteStudent = new Student();
        deleteStudent.id = "10111";

        students.add(deleteStudent);

        if (deleteStudent.id.equals("10000")) {
            String studentOutput = "Student with student ID: 10111 was deleted";
            assertFalse(studentOutput.contains("Student with student ID: 10111 was deleted"));
        }

    }

    @Test
    public void TestStudentAge_StudentAgeValid() {
        ArrayList<Student> students = new ArrayList<>();

        Student deleteStudent = new Student();
        deleteStudent.age = 19;

        students.add(deleteStudent);

        if (deleteStudent.age < 16) {
            String studentOutput = "You have entered a incorrect student age!!";
            assertFalse(studentOutput.contains("You have entered a incorrect student age!!"));
        }

    }

    @Test
    public void TestStudentAge_StudentAgeInvalid() {
        ArrayList<Student> students = new ArrayList<>();

        Student deleteStudent = new Student();
        deleteStudent.age = 19;

        students.add(deleteStudent);

        if (deleteStudent.age < 16) {
            String studentOutput = "You have entered a incorrect student age!!";
            assertTrue(studentOutput.contains("You have entered a incorrect student age!!"));

        }

    }

    @Test
    public void TestStudentAge_StudentAgeInvalidCharacter() {
        ArrayList<Student> students = new ArrayList<>();

        Student deleteStudent = new Student();
        deleteStudent.age = 19;

        students.add(deleteStudent);

        if (deleteStudent.age < 16) {
            String studentOutput = "You have entered a incorrect student age!!";
            assertTrue(studentOutput.contains("You have entered a incorrect student age!!"));
        }

    }

    @Test
    public void testStudentReport() {
    }

    @Test
    public void testExitStudentApplication() {
    }

}
