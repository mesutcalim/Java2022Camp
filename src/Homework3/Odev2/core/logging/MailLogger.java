package Homework3.Odev2.core.logging;

public class MailLogger implements Logger{
    public MailLogger() {
    }

    public void log(String Data) {
        System.out.println("Maile loglandı: "+Data);
    }
}
