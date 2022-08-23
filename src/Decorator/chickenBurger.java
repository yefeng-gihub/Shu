package Decorator;

public class chickenBurger extends Humburger {
    @Override
    public String getName() {
        return "鸡腿堡";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
