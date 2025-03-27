package org.lessons.java.animals;

public class Main {
public static void main(String[] args) {
    

    Dog Cane = new Dog("Cane");
    Eagle Aquila = new Eagle("Aquila");
    Dolphin Delfino = new Dolphin("Delfino");
    Sparrow Passero = new Sparrow("Passero");

    
    System.out.println(Cane);
    System.out.println(Cane.sleep());
    Cane.verse();
    Cane.eat();

    System.out.println("-------------");

    System.out.println(Delfino);
    System.out.println(Delfino.sleep());
    Delfino.verse();
    Delfino.eat();
    Delfino.swim();

    System.out.println("-------------");

    System.out.println(Aquila);
    System.out.println(Aquila.sleep());
    Aquila.verse();
    Aquila.eat();
    Aquila.fly();


    System.out.println("-------------");

    System.out.println(Passero);
    System.out.println(Passero.sleep());
    Passero.verse();
    Passero.eat();
    Passero.fly();

}
}
