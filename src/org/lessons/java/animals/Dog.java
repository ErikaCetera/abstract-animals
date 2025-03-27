package org.lessons.java.animals;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public String sleep(){
        return "zzz..";
    }

    @Override
    public void verse(){
        System.out.println("il cane abbaia");
    }
    
    @Override
    public void eat(){
        System.out.println("il cane mangia crocchette");
    }

    
}
