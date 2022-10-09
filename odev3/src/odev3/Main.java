package odev3;

import odev3.business.CourseService;
import odev3.core.logging.DatabaseILogger;
import odev3.core.logging.FileILogger;
import odev3.core.logging.ILogger;
import odev3.core.logging.MailILogger;
import odev3.dataAccess.HibernateCourseDao;
import odev3.entities.Course;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        /*kodlama.io web sitesinin ana sayfasında bulunan eğitmen, kategori ve kurs bölümlerini katmanlı mimaride kodlamak istiyoruz.

            Önceki derste yaptığımız tekniklerle hem jdbc hem de hibernate üzerinde yazmış gibi simüle ediniz.

            Çoklu loglama yapısını simule ediniz.

        Aşağıdaki isterleri gerçekleştiriniz.

            Kurs ismi tekrar edemez
        Kategori ismi tekrar edemez
        Bir kursun fiyatı 0 dan küçük olamaz*/

        Course course1 = new Course(1,"Java",100,"Yeni başlayanlar");

        ILogger[] ILoggers = {new DatabaseILogger(), new FileILogger(), new MailILogger()};

        CourseService courseService = new CourseService(new HibernateCourseDao(), ILoggers);
        courseService.add(course1);
    }
}