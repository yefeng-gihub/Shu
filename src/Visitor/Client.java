package Visitor;

public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Cat());
        home.add(new Dog());

        Owner owner = new Owner();
        home.action(owner);
        System.out.println("牛马lods饿啊ji");
        System.out.println("tiahfaoij");
        System.out.println("gdfgdf");
    }
}
