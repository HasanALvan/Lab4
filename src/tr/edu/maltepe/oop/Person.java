package tr.edu.maltepe.oop;

import java.util.Vector;

public  class Person implements do_sports {
    private String name;
    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}





    @Override
    public void swim( SportCenter c) {
        System.out.println(getName()+" swimming");
        return;
    }





    @Override
    public void soccer() {
        System.out.println(getName()+" plays soccer ");
        return;
    }



}
