package Plant;

public class Client {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car car = factory.createCar(1);
        System.out.println(car);
    }
}
