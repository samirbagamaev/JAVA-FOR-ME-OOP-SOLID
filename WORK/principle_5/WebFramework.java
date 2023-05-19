package WORK.principle_5;

public class WebFramework {
    public void save(IForm frm){
        ISQL db =  new MySQL();
        db.save(frm);

    }
}
