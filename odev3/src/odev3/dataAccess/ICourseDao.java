package odev3.dataAccess;

import odev3.entities.Course;

import java.util.ArrayList;

public interface ICourseDao
{
    void add(Course course);

    ArrayList<Course> fetchCorses();
}
