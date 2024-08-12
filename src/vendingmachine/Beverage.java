package vendingmachine;

public class Beverage {
    private final String name;
    private final int volume;

    public Beverage(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Beverage: " + name + ", volume: " + volume + "ml";
    }
}


