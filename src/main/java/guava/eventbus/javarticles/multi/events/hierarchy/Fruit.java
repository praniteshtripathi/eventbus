package guava.eventbus.javarticles.multi.events.hierarchy;

public class Fruit {
    private String name;
    public Fruit(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }   
    public String toString() {
        return name;
    }
}