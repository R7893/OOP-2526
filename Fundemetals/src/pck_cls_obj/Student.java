package pck_cls_obj;

public class Student {

    private String name;

    private String surname;

    private int id;

    public Student(String name, String surname, int id){
        this.name = name;
        this.surname = surname;
    }
    /*
    public Student(String name, String surname){
        this.id = cntID;
        cnt.ID++;
        this.name = name;
        this.surname = surname;
    }*/

    public Student(String name, String surname, int id);

    public void subscribeToStudentService(){
        System.out.println("Student's id: " + id);
        System.out.println(name + " - " + surname + " is subrscribed to student service.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
    public Hlace operiMe(Hlace hlace){
        hlace.setCiste(true);
        System.out.println(this + "je oprao hlace");
        return hlace;
    }
}
