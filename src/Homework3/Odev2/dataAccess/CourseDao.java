package Homework3.Odev2.dataAccess;

import Homework3.Odev2.entities.Course;

import java.util.List;

public interface CourseDao {
    void add(Course course);
    List<Course> getAll();
}
