package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EducatorTest {

    @Before
    public void setUp() {
        Educator educator = Educator.LEON;
        educator.timeWorked = 0;
    }

    @Test
    public void implementationTest() {
        // When
        Educator educator = Educator.LEON;

        // Then
        Assert.assertTrue(educator instanceof Teacher);
    }

    @Test
    public void teachTest() {
        // Given
        Educator educator = Educator.LEON;
        Student student = new Student(1, "Cay");
        double numberOfHours = 2;
        double expectedTeachingTime = 2;

        // When
        educator.teach(student, numberOfHours);
        double actualTeachingTime = educator.timeWorked;

        // Then
        Assert.assertEquals(expectedTeachingTime, actualTeachingTime, 0);
    }

    @Test
    public void lectureTest() {
        // Given
        Educator educator = Educator.LEON;
        Student dave = new Student(1, "Dave");
        Student jacob = new Student(2, "Jacob");
        Student mike = new Student(3, "Mike");
        Student[] students = new Student[] {dave, jacob, mike};
        double numberOfHours = 18;
        double expectedTeachingTime = 18;

        // When
        educator.lecture(students, numberOfHours);
        double actualTeachingTime = educator.timeWorked;

        // Then
        Assert.assertEquals(expectedTeachingTime, actualTeachingTime, 0);
    }

}