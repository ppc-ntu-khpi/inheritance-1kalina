package domain;

public class Dragon extends Predator {

    private String kind;

    public Dragon(String name, int weight, String kind) {
        super(name, weight);
        this.kind = kind;
    }

    public Dragon() {
        this("Toothless", 805, "just a kind dragon");
    }

    public Dragon(String name) {
        this(name, 805, "just a kind dragon");
    }

    public void play() {
        System.out.println("Dragon is playing... with acetylene");
    }

    @Override
    public String toString() {
        return super.toString() + "\nKind:\t" + this.kind + "\n\nThis is Dragon!";
    }

    @Override
    public void speak() {
        System.out.println("Acctually he is grumbling... but he is a dragon, so it's ok");
    }

    @Override
    public void eat() {
        System.out.println("Dragon eats fish... and sometimes people");
    }
}