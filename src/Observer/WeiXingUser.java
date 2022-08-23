package Observer;
//具体观察者
public class WeiXingUser implements Observer{
    /**
     *
     */
    private String name ;

    public WeiXingUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name+"_"+message);
    }
}
