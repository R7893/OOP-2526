package pck_cls_obj;

public class Hlace {
    private String model;
    public boolean ciste = true;

    public Hlace(String model){
        this.model = model;
        this.ciste = true;
    }
    public boolean getCiste() {
        return ciste;

    }
    public void setCiste(boolean setValue);

    public void koristeneHlace(){
        this.ciste = false;
    }
    public Hlace nekakoOciscene(Student student){
        return student.operiMe(this);
    }
}
