package odev3.dataAccess;

import odev3.entities.Course;

public class HibernateCourseDao implements ICourseDao
{
    public void add(Course course)
    {
        System.out.println("Hibernate ile veritabanına eklendi...");
    }
}
