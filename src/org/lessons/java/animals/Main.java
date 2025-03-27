package org.lessons.java.animals;

public class Main {
public static void main(String[] args) {
    

    Dog Cane = new Dog("Cane");
    Eagle Aquila = new Eagle("Aquila");
    Dolphin Delfino = new Dolphin("Delfino");
    Sparrow Passero = new Sparrow("Passero");

    System.out.println(Cane.sleep());
    Cane.verse();
    Cane.eat();


    System.out.println(Delfino.sleep());
    Delfino.verse();
    Delfino.eat();

    System.out.println(Aquila.sleep());
    Aquila.verse();
    Aquila.eat();

    System.out.println(Passero.sleep());
    Passero.verse();
    Passero.eat();

}
}
