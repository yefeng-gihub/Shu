package Observer;
//抽象被观察者
public interface Subject {
    public void attach(Observer observer);
    public void delete(Observer observer);
    public void modify(String message);



}
