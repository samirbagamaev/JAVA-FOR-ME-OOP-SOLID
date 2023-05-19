package WORK.principle_5;

public class ModelForm implements IForm {
    int id; //идентификатор личности
    int old; //возраст
    String fio; //фио

    ModelForm(int id, int old, String fio){
        this.id = id;
        this.old = old;
        this.fio = fio;
    }
}
