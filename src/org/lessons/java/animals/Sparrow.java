package org.lessons.java.animals;

public class Sparrow extends Animal{

    public Sparrow(String name){
        super(name);
    }

    @Override
    public String sleep(){
        return "zzz..";
       }

    @Override
    public void verse(){
        System.out.println("il passero cinguetta");
    }
    
    @Override
    public void eat(){
        System.out.println("il passero mangia insetti");
    }



}
