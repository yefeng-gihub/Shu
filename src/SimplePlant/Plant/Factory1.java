package SimplePlant.Plant;

public class Factory1 implements FactoryCar {
    @Override
    public Car createCar() {
        return new Car1();
    }
}
