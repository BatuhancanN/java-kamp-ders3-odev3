package odev3.dataAccess;

import odev3.entities.Course;

public class JdbcCourseDao implements ICourseDao
{
    public void add(Course course)
    {
        System.out.println("JDBC ile veritabanına eklendi...");
    }
}
