package vendingmachine;

public class HotBeverage extends Beverage {
    private final int temperature;

    public HotBeverage(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", temperature: " + temperature + "°C";
    }
}


