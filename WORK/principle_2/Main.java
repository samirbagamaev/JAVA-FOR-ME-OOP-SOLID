/*
2. Open-closed principle
Принцип открытости/закрытости

классы должны быть открыты для расширения
и одновременно закрыты для модификации.
Иными словами, должна быть возможность
добавлять новые свойства и расширять класс
без изменения внутренней реализации
существующих свойств.

«закрыт для модификации»
«Открыт для расширений» 
*/

package WORK.principle_2;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("Xiaomi", 512);
        SaveComputerToFile saver = new SaveComputerToFile();
        saver.save("out.dat", comp);
        //"out.dat" это просто файл, название может быть другим
        //comp - объект, который мы хотим сохранить

    }
}

//ОТВЕТ: Сохранение в файл out.dat,WORK.principle_2.Computer@2ff4acd0