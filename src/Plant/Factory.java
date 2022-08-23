package Plant;

public class Factory {
    public Car createCar(int a){
        switch (a){
            case 1:
                return new Car1();
            case 2:
                return new Car2();
        }
        return null;
    }
}
