/*
 * ВНИМАНИЕ!!!
 * ЭТО НАРУШЕНИЕ ПРИНЦИПА БАРБАРЫ ЛИСКОВ, А НЕ САМ ПРИНЦИП
 */

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

package WORK.principle_3;

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
