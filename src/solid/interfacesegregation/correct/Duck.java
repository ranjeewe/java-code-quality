package solid.interfacesegregation.correct;

import solid.interfacesegregation.correct.Bird;

public class Duck implements Bird {

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void run() {
        System.out.println("Duck is running");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}