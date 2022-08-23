package JianZhao;

public abstract class Builder {
    public abstract void buildCpu(String cpu);
    public abstract void buildMainBoard(String mainBoard);
    public abstract void buildram(String ram);

    public abstract Computer craete();

}
