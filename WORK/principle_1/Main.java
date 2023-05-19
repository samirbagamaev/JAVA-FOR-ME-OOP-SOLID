/*
1. Single responsibility principle
Принцип единственной ответственности

Принцип гласит, что может быть только
одна причина, приводящая к изменению класса.
Другими словами, каждый класс должен иметь
только одну ответственность,
которая должна быть инкапсулирована
в этом классе.

- тестируемость;
- читаемость;
- короткое и понятное описание класса;
- простота сопровождения.
*/

package WORK.principle_1;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("Xiaomi", 512);
        SaveComputer saver = new SaveComputer();
        saver.saveToFile("out.dat", comp);
        //"out.dat" это просто файл, название может быть другим
        //comp - объект, который мы хотим сохранить

    }
}

//ОТВЕТ: Сохранение в файл out.dat,WORK.principle_1.Computer@279f2327
