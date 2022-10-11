package odev3.dataAccess;

import odev3.entities.Course;

import java.util.ArrayList;

public class JdbcCourseDao implements ICourseDao
{
    public void add(Course course)
    {
        System.out.println("JDBC ile veritabanına eklendi...");
    }

    @Override
    public ArrayList<Course> fetchCorses() {
        ArrayList<Course> courses = new ArrayList<>();
        courses.add(new Course(1,"Kurs1",40,"programlama"));
        courses.add(new Course(2,"Kurs2",100,"programlama"));
        courses.add(new Course(3,"Kurs3",199.99,"programlama"));
        courses.add(new Course(4,"Kurs4",133,"programlama"));
        courses.add(new Course(5,"Kurs5",29.90,"programlama"));

        return courses;
    }
}
