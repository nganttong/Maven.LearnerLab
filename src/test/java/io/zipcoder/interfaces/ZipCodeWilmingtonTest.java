package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Before
    public void setUp() {
        Students students = Students.getInstance();
        for (Student student : students.personList) {
            student.totalStudyTime = 0;
        }
        Educator educator = Educator.LEON;
        educator.timeWorked = 0;
    }

    @Test
    public void hostLectureTest_CheckStudentStudyTime() {
        // Given
        Students students = Students.getInstance();
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Integer expectedNewStudyTime = 3;
        Integer hoursOfLecture = 54;

        // When
        zipCodeWilmington.hostLecture(Educator.LEON, hoursOfLecture);
        Map<Student, Double> map = zipCodeWilmington.getStudyMap();

        // Then

        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(1)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(2)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(3)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(4)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(5)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(6)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(7)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(8)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(9)), 0);
        Assert.assertEquals(expectedNewStudyTime, map.get(students.findById(10)), 0);

    }

    @Test
    public void hostLectureTest_CheckEducatorTeachingTime() {
        // Given
        Students students = Students.getInstance();
        ZipCodeWilmington zipCodeWilmington = ZipCodeWilmington.getInstance();
        Integer expectedNewTeachingTime = 54;
        Integer hoursOfLecture = 54;

        // When
        zipCodeWilmington.hostLecture(Educator.LEON, hoursOfLecture);
        Double actualNewTeachingTime = Educator.LEON.timeWorked;

        // Then
        Assert.assertEquals(expectedNewTeachingTime, actualNewTeachingTime, 0);
    }

}