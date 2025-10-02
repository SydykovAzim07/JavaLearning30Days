package oop_basics.day10.task3;

import java.util.Arrays;

public class NumberList implements Sortable{
    private int[] numbers;

    public NumberList(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void sort() {
        Arrays.sort(numbers);

    }

    @Override
    public void print() {
        System.out.printf("Числа отсортированы: %s%n", Arrays.toString(numbers));
    }
}
