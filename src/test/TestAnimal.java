package test;

import domain.Dragon;

public class TestAnimal {

    public static void main(String[] args) {
        Dragon dragon = new Dragon("Toothless");
        System.out.println(dragon);
        dragon.hunt();
        dragon.eat();
        dragon.speak();
        dragon.play();
    }
}