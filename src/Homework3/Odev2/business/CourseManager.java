package Homework3.Odev2.business;

import Homework3.Odev2.core.logging.Logger;
import Homework3.Odev2.dataAccess.CourseDao;
import Homework3.Odev2.dataAccess.JDBCCourseDao;
import Homework3.Odev2.entities.Course;

import java.util.List;

public class CourseManager {
    private final CourseDao courseDao;
    private final List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) {

//        if (course.getCourses() != null) {
//            for (Course c : courseDao.getAll()) {
//                if (c.getCourseName().equals(course.getCourseName())) {
//                    System.out.println("Bu isimle bir kurs mevcuttur.");
//                }
//                if (c.getCategory().equals(course.getCategory())) {
//                    System.out.println("Bu kategoride bir kurs mevcuttur.");
//                }
//            }
//        }
        if (course.getPrice() < 0) {
            System.out.println("Fiyat 0'ın altında olamaz");
        }else {
            JDBCCourseDao courseDao = new JDBCCourseDao();
            courseDao.add(course);
            for (Logger logger : loggers) {
                logger.log(course.getCourseName());
            }
        }



    }
}
