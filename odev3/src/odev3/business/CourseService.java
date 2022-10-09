package odev3.business;

import odev3.core.logging.ILogger;
import odev3.dataAccess.ICourseDao;
import odev3.entities.Course;

public class CourseService
{
    private ICourseDao courseDao;
    private ILogger[] ILoggers;

    public CourseService(ICourseDao courseDao, ILogger[] ILoggers) {
        this.courseDao = courseDao;
        this.ILoggers = ILoggers;
    }

    public void add(Course course) throws Exception
    {
        if(course.getPrice() < 0) throw new Exception("Ürün fiyatı negatif olamaz...");

        course.stream().anyMatch(Course -> Course.getName().equalsIgnoreCase(course.getName()))

        courseDao.add(course);

        for(ILogger ILogger : ILoggers)
        {
            ILogger.log(course.getName());
        }
    }
}
