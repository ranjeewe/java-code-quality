package solid.interfacesegregation.wrong;

public class FarmMonitor {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Duck duck = new Duck();

        System.out.println("How they run ");
        cat.run();
        duck.run();
        System.out.println("How they eat ");
        cat.eat();
        duck.eat();
        System.out.println("How they fly ");
        cat.fly();
        duck.fly();
    }
}