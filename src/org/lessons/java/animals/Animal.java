package org.lessons.java.animals;

public abstract class  Animal {
 protected String name;


public Animal(String name){
    this.name = name;
}

public String getName(){
    return name;
}

public void setName(String name){
    this.name = name;
}


public String sleep(){
 return "zzz..";
}

public abstract void verse();

public abstract void eat();

@Override
public String toString() {
    return String.format("Nome dell'animale: %s", this.name);
}
}
