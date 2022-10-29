package Homework3.Odev2;

import Homework3.Odev2.business.CourseManager;
import Homework3.Odev2.core.logging.FileLogger;
import Homework3.Odev2.core.logging.Logger;
import Homework3.Odev2.core.logging.MailLogger;
import Homework3.Odev2.dataAccess.JDBCCourseDao;
import Homework3.Odev2.entities.Category;
import Homework3.Odev2.entities.Course;
import Homework3.Odev2.entities.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws  Exception{

        Course course1 = new Course("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", Category.JAVA,new Teacher("Mesut Çalım"),299.00);
        Course course2 = new Course("Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", Category.JAVA,new Teacher("Mesut Çalım"),299.00);
        List<Logger> loggers= new ArrayList<>();
        loggers.add(new FileLogger());
        loggers.add(new MailLogger());
        CourseManager courseManager = new CourseManager(new JDBCCourseDao(),loggers);
        courseManager.add(course1);
        courseManager.add(course2);

    }
}
