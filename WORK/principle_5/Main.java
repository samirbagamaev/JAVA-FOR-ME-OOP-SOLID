/*
5. Dependency inversion principle
Принцип инверсии зависимостей

- модули высокого уровня не должны зависеть
 от модулей нижнего уровня.
И те, и другие должны зависеть от абстракций.
- абстракции не должны зависеть от деталей.
Детали должны зависеть от абстракций.
*/

package WORK.principle_5;

public class Main {
    public static void main(String[] args) {
        ModelForm f = new ModelForm(1, 30, "Балакирева");
        WebFramework w = new WebFramework();
        w.save(f);
        
    }
}

//ОТВЕТ: запись формы в базу данных