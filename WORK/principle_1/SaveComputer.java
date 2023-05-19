package WORK.principle_1;

public class SaveComputer {

    public void saveToFile(String path,Computer cmp){
        System.out.println("Сохранение в файл " + path + "," + cmp); //path = путь
    }
    public void saveToBD(String path,Computer cmp){
        System.out.println("Сохранение в БАЗУ ДАННЫХ " + path + "," + cmp);
    }
    
    
}
