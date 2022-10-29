package Homework3.Odev2.entities;

public class Teacher {
    private int teacherId=1;
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherId +=1;
        this.teacherName = teacherName;
    }
}
