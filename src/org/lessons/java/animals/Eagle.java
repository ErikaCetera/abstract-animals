package org.lessons.java.animals;

public class Eagle extends Animal {

    public Eagle(String name){
        super(name);
    }

    @Override
    public String sleep(){
        return "zzz..";
       }

    @Override
    public void verse(){
        System.out.println("l'aquila strida");
    }
    
    @Override
    public void eat(){
        System.out.println("l'aquila mangia selvaggina");
    }

    

}
