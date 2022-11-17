package Homework2.AbstractClasses.AbstractDemo;

public class MySqlDatabaseManager extends BaseDatebaseManager{
    @Override
    public void getData() {
        System.out.println("Veri getirildi : MySql");
    }
}
