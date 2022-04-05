package tr.edu.maltepe.oop;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Student s = new Student("Hasan");
        Professor p =new Professor("Ensar");
        SportCenter center =new SportCenter() ;



        center.inSport_Center(s);
        center.inSport_Center(p);
        s.soccer();
        p.swim(center);
        center.outSport_Center(s);
        center.outSport_Center(p);

}}
