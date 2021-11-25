package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    @Test
    public void implementationTest() {
        // Given
        long id = 1;
        String name = "Cay";

        // When
        Instructor instructor = new Instructor(id, name);

        // Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest() {
        // Given
        long id = 1;
        String name = "Cay";

        // When
        Instructor instructor = new Instructor(id, name);

        // Then
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void teachTest() {
        // Given
        Instructor instructor = new Instructor(1, "Cay");
        Student student = new Student(2, "Relik");
        double numberOfHours = 5;
        double expectedStudyTime = 5;

        // When
        instructor.teach(student, numberOfHours);
        double actualStudyTime = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedStudyTime, actualStudyTime, 0);
    }

    @Test
    public void lectureTest() {
        // Given
        Instructor instructor = new Instructor(1, "Cay");
        Student studentBill = new Student(2, "Relik");
        Student studentBen = new Student(3, "Jacob");
        Student studentAllen = new Student(4, "KC");
        Student[] students = new Student[] {studentBill, studentBen, studentAllen};
        double numberOfHours = 21;
        double expectedStudyTime = 7;

        // When
        instructor.lecture(students, numberOfHours);
        double actualStudyTimeOfBill = studentBill.getTotalStudyTime();
        double actualStudyTimeOfBen = studentBen.getTotalStudyTime();
        double actualStudyTimeOfAllen = studentAllen.getTotalStudyTime();

        // Then
        Assert.assertEquals(expectedStudyTime, actualStudyTimeOfBill, 0);
        Assert.assertEquals(expectedStudyTime, actualStudyTimeOfBen, 0);
        Assert.assertEquals(expectedStudyTime, actualStudyTimeOfAllen, 0);
    }

}