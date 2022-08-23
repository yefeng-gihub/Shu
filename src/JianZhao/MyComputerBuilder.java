package JianZhao;

public class MyComputerBuilder extends Builder {
private Computer computer=    new Computer();

    @Override
    public void buildCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void buildMainBoard(String mainBoard) {
computer.setMainBoard(mainBoard);
    }

    @Override
    public void buildram(String ram) {
computer.setRam(ram);
    }

    @Override
    public Computer craete() {
        return computer;
    }
}
