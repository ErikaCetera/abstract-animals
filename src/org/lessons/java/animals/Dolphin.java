package org.lessons.java.animals;

public class Dolphin extends Animal implements Swimable{

    public Dolphin(String name){
        super(name);
    }

    @Override
    public String sleep(){
        return "zzz..";
       }

    @Override
    public void verse(){
        System.out.println("il Delfino fa clicks");
    }
    
    @Override
    public void eat(){
        System.out.println("il delfino mangia piccoli pesci");
    }

    public void swim(){
        System.out.println("Sto nuotando");
    }
}
