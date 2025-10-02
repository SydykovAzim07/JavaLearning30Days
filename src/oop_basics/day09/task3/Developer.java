package oop_basics.day09.task3;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void work () {
        System.out.printf("Разработчик %s пишет код на %s%n" , name , programmingLanguage);
    }
}
