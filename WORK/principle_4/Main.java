/*
4. Interface segregation principle
Принцип разделения интерфейса

Клиенты не должны реализовывать интерфейсы,
которые они не используют.
Данный принцип требует разделения «толстых»
интерфейсов на несколько специализированных,
связанных общей функциональностью.
*/

package WORK.principle_4;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("Xiaomi", 5000);
        // SaveComputerToFile saver = new SaveComputerToFile();
        // saver.save("out.dat", comp);
        //"out.dat" это просто файл, название может быть другим
        //comp - объект, который мы хотим сохранить
        test();

    }
    public static void test(){
        Computer comp = new Computer("Xiaomi", 5000);
        Computer comp2 = new OmenHP("OmenHP", 5000);

        comp2.setData("Xiaomi");

        if (comp.name.compareTo(comp2.name) == 0 && comp.memory_size == comp2.memory_size){
            System.out.println("test ok");
        }
        else{
            System.out.println("test fail");
        }
    }
}

//ОТВЕТ: test fail
