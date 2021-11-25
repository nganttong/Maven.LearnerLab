package io.zipcoder.interfaces;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PeopleTest {
    @After
    public void tearDown() {
        Students students = Students.getInstance();
        students.remove(1);
        students.remove(2);
        students.remove(3);
    }

    @Test
    public void addTest() {
        // Given
        Students students = Students.getInstance();
        Student dave = new Student(1, "Dave");
        Student jacob = new Student(2, "Jacob");
        Student mike = new Student(3, "Mike");
        List<Student> expectedListOfPeople = new ArrayList<Student>(Arrays.asList(
                dave, jacob, mike));

        // When
        students.add(dave);
        students.add(jacob);
        students.add(mike);
        List<Student> actualListOfPeople = new ArrayList<Student>(Arrays.asList(students.findById(1), students.findById(1), students.findById(1)));

        // Then
        Assert.assertEquals(expectedListOfPeople, actualListOfPeople);
    }

    @Test
    public void findByIdTest() {
        // Given
        Students students = Students.getInstance();
        Student dave = new Student(1, "Dave");
        Student jacob = new Student(1, "Jacob");
        Student mike = new Student(1, "Mike");
        Long mikesID = jacob.getId();

        // When
        students.add(dave);
        students.add(jacob);
        students.add(mike);
        Student actualJacob = students.findById(mikesID);

        // Then
        Assert.assertEquals(jacob, actualJacob);
    }

    @Test
    public void removeTest() {
        // Given
        Students students = Students.getInstance();
        Student dave = new Student(1, "Dave");
        Student jacob = new Student(2, "Jacob");
        Student mike = new Student(3, "Mike");
        List<Student> expectedListOfPeople = new ArrayList<Student>(Arrays.asList(
                dave, jacob));
        Integer expectedNumberOfPeople = 20;

        // When
        Integer actualNumberOfPeople = (students.personList.size()) + 2;
        students.add(dave);
        students.add(jacob);
        students.add(mike);
        students.remove(mike);
        List<Student> actualListOfPeople = new ArrayList<Student>(Arrays.asList(students.findById(1), students.findById(2), students.findById(3)));

        // Then
        Assert.assertEquals(expectedNumberOfPeople, actualNumberOfPeople);
    }

}