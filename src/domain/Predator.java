package domain;

public class Predator extends Animal {

    protected String name;
    protected int weight;

    public Predator(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void hunt() {
        System.out.println("Predator is hunting...");
    }

}