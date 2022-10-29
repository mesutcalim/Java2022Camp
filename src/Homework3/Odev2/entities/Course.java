package Homework3.Odev2.entities;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id = 1;
    private String courseName;
    private Category category;
    private Teacher teacher;
    private double price;
    private static List<Course> courses = new ArrayList<>();

    public Course(String courseName, Category category, Teacher teacher, double price) {
        this.id += 1;
        this.courseName = courseName;
        this.category = category;
        this.teacher = teacher;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
