package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentsTest {
    @Test
    public void isAllOfCohortInStudentsTest() {
        // Given
        Students students = Students.getInstance();
        Student mike = new Student(1, "Mike");
        Student carnell = new Student(2, "Carnell");
        Student tra = new Student(3, "Tra");
        Student john = new Student(4, "John");
        Student dave = new Student(5, "Dave");
        Student jacob = new Student(6, "Jacob");
        Student paul = new Student(7, "Paul");
        Student amanda = new Student(8, "Amanda");
        Student junior = new Student(9, "Junior");
        Student keerthana = new Student(10, "Keerthana");

        // When
        boolean studentMike = students.contains(mike);
        boolean studentCarnell = students.contains(carnell);
        boolean studentTra = students.contains(tra);
        boolean studentJohn = students.contains(john);
        boolean studentDave = students.contains(dave);
        boolean studentJacob = students.contains(jacob);
        boolean studentPaul = students.contains(paul);
        boolean studentAmanda = students.contains(amanda);
        boolean studentJunior = students.contains(junior);
        boolean studentKeerthana = students.contains(keerthana);

        // Then
        Assert.assertTrue(studentMike);
        Assert.assertTrue(studentCarnell);
        Assert.assertTrue(studentTra);
        Assert.assertTrue(studentJohn);
        Assert.assertTrue(studentDave);
        Assert.assertTrue(studentJacob);
        Assert.assertTrue(studentPaul);
        Assert.assertTrue(studentAmanda);
        Assert.assertTrue(studentJunior);
        Assert.assertTrue(studentKeerthana);
    }

}