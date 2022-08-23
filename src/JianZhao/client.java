package JianZhao;

public class client {
    public static void main(String[] args) {
        MyComputerBuilder myComputerBuilder = new MyComputerBuilder();
        Director director = new Director(myComputerBuilder);
        Computer computer = director.creatComputer("i7", "intel主板", "wxing");
        System.out.println(computer);
    }
}
