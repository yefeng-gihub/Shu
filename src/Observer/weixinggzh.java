package Observer;
//微信公众号
//具体被观察者

import java.util.ArrayList;
import java.util.List;

public class weixinggzh implements Subject{
    private List<Observer> weixinuselist = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weixinuselist.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        weixinuselist.remove(observer);
    }

    @Override
    public void modify(String message) {
        for (Observer object:weixinuselist
             ) {object.update(message);

        }
    }
}
