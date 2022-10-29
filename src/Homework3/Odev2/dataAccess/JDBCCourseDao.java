package Homework3.Odev2.dataAccess;

import Homework3.Odev2.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class JDBCCourseDao implements CourseDao{
    List<Course> courses = new ArrayList<Course>();
    public void add(Course course) {
        System.out.println("JDBC ile giriş yapıldı");

    }
    @Override
    public List<Course> getAll() {
        return courses ;
    }
}
