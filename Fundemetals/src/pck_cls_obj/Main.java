package pck_cls_obj;

import pck_cls_obj.Student;

public class AppTest{

    public static void main(String[] args){
        String name;
        Student s1 = new Student(name "Petar", surname "Petrić", id:12);
        Student s2 = new Student(name "Ivan", surname "Petrov", id:23);
        s1.subscribeToStudentService();
        s2.subscribeToStudentService();
        System.out.println(s1);
        Hlace h1 = new Hlace(model "Levis 501");
        h1.koristeneHlace();
        Hlace h2;
        h2.nekakoOciscene(s1);
        System.out.println(h1);
        System.out.println(h2);

    }
}
