package JianZhao;

public class Computer {
    private String cpu;
    private String mainBoard;
    private String ram;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
