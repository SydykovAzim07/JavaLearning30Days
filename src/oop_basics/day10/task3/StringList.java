package oop_basics.day10.task3;

import java.util.Arrays;

public class StringList implements Sortable{
    private String[] strings;

    public StringList(String[] strings) {
        this.strings = strings;
    }

    @Override
    public void sort() {
        Arrays.sort(strings);
    }

    @Override
    public void print() {
        System.out.printf("Строки отсортированы: %s%n", Arrays.toString(strings));
    }
}
