package Decorator;

public class Chill extends Condiment {
    Humburger humburger;

    public Chill(Humburger humburger) {
        this.humburger = humburger;
    }

    @Override
    public String getName() {
        return humburger.getName()+"加辣椒";
    }

    @Override
    public double getPrice() {
        return humburger.getPrice()+1.5;
    }
}
