package oop_basics.day10.task3;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {5, 3, 8, 1};
        String [] str = {"banana", "apple", "cherry"};
        Sortable sortables = new NumberList(numbers);
        Sortable sortables2 = new StringList(str);
        sortables.sort();
        sortables2.sort();
        sortables.print();
        sortables2.print();
    }
}
