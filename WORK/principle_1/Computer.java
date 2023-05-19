package WORK.principle_1;

public class Computer {
    String name; // название
    int memory_size; //размер памяти

    Computer(String name, int memory_size){
        this.name = name;
        this.memory_size = memory_size;
    }

    /*
    ПРИ ИСПОЛЬЗОВАНИИ 1 ПРИНЦИПА ТАК НЕ ДЕЛАЕТСЯ, ТАК КАК КОМПЬЮТЕР БЕРЕТ
    НА СЕБЯ МНОГО ЗАДАЧ, ДЛЯ ЭТОГО ВСЕГО НУЖЕН НОВЫЙ КЛАСС
    А В НАШЕМ СЛУЧАЕ ЭТО   SaveComputer.java
    */

    // public void save(){
    //     System.out.println("Сохранение объекта в класс");
    // }
    // public void load(){
    //     System.out.println("Загрузка объекта класса из файла");
    // }
}
