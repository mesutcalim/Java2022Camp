package Homework3.Odev2.core.logging;

public class FileLogger implements Logger{
    public FileLogger() {
    }

    public void log(String Data) {
        System.out.println("Dosyaya loglandı: " + Data);
    }
}
