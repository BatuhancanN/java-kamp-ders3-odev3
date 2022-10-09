package odev3.core.logging;

public class DatabaseILogger implements ILogger
{
    @Override
    public void log(String data)
    {
        System.out.println("Veritabanına loglandı: " + data);
    }
}
