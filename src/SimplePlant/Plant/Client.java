package SimplePlant.Plant;

public class Client {
    public static void main(String[] args) {
        Factory1 factory1 = new Factory1();
        Car car = factory1.createCar();
    }
}
