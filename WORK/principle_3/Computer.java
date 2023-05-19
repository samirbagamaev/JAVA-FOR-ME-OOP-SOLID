package WORK.principle_3;

public class Computer {
    String name; // название
    int memory_size; //размер памяти

    Computer(String name, int memory_size){
        this.name = name;
        this.memory_size = memory_size;
    }
    public void setData(String name){
        this.name = name;
    }
}