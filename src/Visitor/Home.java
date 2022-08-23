package Visitor;

import java.util.ArrayList;
import java.util.List;

//对象结构类
public class Home {
    private List<Animal> nodeList = new ArrayList<Animal>();

    public void add(Animal animal) {
        nodeList.add(animal);
    }

    public void action(Person person) {
        for (Animal a:nodeList
             ) {
            a.accept(person);
        }
    }
}
