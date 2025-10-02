package oop_basics.day09.task2;

public class Bicycle extends Vehicle {
    private boolean hasBasket;

    public Bicycle(int speed, boolean hasBasket) {
        super(speed);
        this.hasBasket = hasBasket;
    }
    @Override
    public void move () {
        if (hasBasket) {
            System.out.printf("Велосипед %s корзиной едет со скоростью %d%n", "c" , speed);
        }else {
            System.out.printf("Велосипед %s корзины едет со скоростью %d%n", "без" , speed);
        }
    }
}
