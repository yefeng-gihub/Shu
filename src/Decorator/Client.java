package Decorator;

public class Client {
    public static void main(String[] args) {
        chickenBurger chickenBurger = new chickenBurger();
        System.out.println(chickenBurger.getName()+chickenBurger.getPrice());
        Lettuce lettuce = new Lettuce(chickenBurger);
        System.out.println(lettuce.getName()+lettuce.getPrice());
        Chill chill = new Chill(lettuce);
        System.out.println(chill.getPrice());
    }
}
