package odev3.business;

import odev3.core.logging.ILogger;
import odev3.dataAccess.ICourseDao;
import odev3.entities.Course;

import java.util.ArrayList;

public class CourseService
{
    private ICourseDao courseDao;
    private ILogger[] ILoggers;
    private ArrayList<Course> courses;

    public CourseService(ICourseDao courseDao, ILogger[] ILoggers) {
        this.courseDao = courseDao;
        this.ILoggers = ILoggers;
        courses = courseDao.fetchCorses();
    }

    public void add(Course course) throws Exception
    {
        if(course.getPrice() < 0) throw new Exception("Ürün fiyatı negatif olamaz...");

        if(courses.stream().anyMatch(c -> c.getName().equalsIgnoreCase(course.getName())))
        {
            throw new Exception("Bu kurs zaten eklenmiş: " + course.getName());
        }
        else if(courses.stream().anyMatch(c -> c.getCategory().equalsIgnoreCase(course.getCategory())))
        {
            throw new Exception("Bu kategoride bir kurs zaten var: " + course.getCategory());
        }

        courseDao.add(course);

        for(ILogger ILogger : ILoggers)
        {
            ILogger.log(course.getName());
        }
    }
}
