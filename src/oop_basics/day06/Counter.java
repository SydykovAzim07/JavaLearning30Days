package oop_basics.day06;

public class Counter {
    private static int counter ;
    private int id;
    public Counter() {
        counter++;
        id = counter ;

    }
    public int getId() {
        return id;
    }
    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println("Объект: 1, " + c.getId());
        System.out.println("Объект: 2, " + c2.getId());
        System.out.println("Объект: 3, " + c3.getId());
        System.out.println("Общее количество объектов: " + Counter.getCounter());

    }
}
