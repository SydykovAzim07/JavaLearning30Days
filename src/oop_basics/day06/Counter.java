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
    public void printInfo(int index) {
        System.out.println("Объект " + index + ", ID: " + id);

    }

    public static void main(String[] args) {
        Counter c = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        c.printInfo(1);
        c2.printInfo(2);
        c3.printInfo(3);

    }
}
