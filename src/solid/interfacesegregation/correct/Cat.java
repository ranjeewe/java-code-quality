package solid.interfacesegregation.correct;

import solid.interfacesegregation.correct.Animal;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void run() {
        System.out.println("Cat is runing");
    }
}