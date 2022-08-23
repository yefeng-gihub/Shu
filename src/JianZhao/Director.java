package JianZhao;

public class Director {
    Builder builder=null;
    public Director(Builder builder) {
        this.builder=builder;
    }

    public Computer creatComputer(String cpu,String mainBoard,String ram) {
        this.builder.buildCpu(cpu);
        this.builder.buildMainBoard(mainBoard);
        this.builder.buildram(ram);
        return builder.craete();


    }
}
