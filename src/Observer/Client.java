package Observer;

public class Client {
    public static void main(String[] args) {
        weixinggzh mSubscriptionSubject=new weixinggzh();
        //创建微信用户
        WeiXingUser user1=new WeiXingUser("杨影枫");
        WeiXingUser user2=new WeiXingUser("月眉儿");
        WeiXingUser user3=new WeiXingUser("紫轩");
        //订阅公众号
        mSubscriptionSubject.attach(user1);
        mSubscriptionSubject.attach(user2);
        mSubscriptionSubject.attach(user3);
        //公众号更新发出消息给订阅的微信用户
        mSubscriptionSubject.modify("刘望舒的专栏更新了");
    }
}