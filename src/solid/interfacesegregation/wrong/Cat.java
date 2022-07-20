package solid.interfacesegregation.wrong;

import solid.interfacesegregation.wrong.Animal;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void run() {
        System.out.println("Cat is runing");
    }

    @Override
    public void fly() {
        throw new RuntimeException("Cats don't fly");
    }
}