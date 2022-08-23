package SimplePlant.Plant;

public class Factory2 implements FactoryCar {
    @Override
    public Car createCar() {
        return new Car2();
    }
}
