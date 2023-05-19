package WORK.principle_5;

public class OmenHP extends Computer {
    OmenHP(String name, int memory_size) {
        super(name, memory_size);
    }

    public void setData(String name) {
        this.name = name;
        this.memory_size = 8000;
    }
}
