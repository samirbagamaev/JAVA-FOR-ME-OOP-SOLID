package WORK.principle_2;

public class SaveComputerToDB implements SaveInterface {

    public void save(String path, Computer cmp) {
        System.out.println("Сохранение в БАЗУ ДАННЫХ " + path + "," + cmp); // path = путь
    }

}