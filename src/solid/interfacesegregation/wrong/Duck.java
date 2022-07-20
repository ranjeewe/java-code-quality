package solid.interfacesegregation.wrong;

import solid.interfacesegregation.wrong.Animal;

public class Duck implements Animal {

    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void run() {
        System.out.println("Duck is runing");
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}