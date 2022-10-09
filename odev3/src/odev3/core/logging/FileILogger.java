package odev3.core.logging;

public class FileILogger implements ILogger
{
    @Override
    public void log(String data)
    {
        System.out.println("Dosyaya loglandı: " + data);
    }
}
