package vendingmachine;

import java.util.ArrayList;
import java.util.List;

public class HotBeverageVendingMachine implements VendingMachine {
    private final List<HotBeverage> beverages;

    public HotBeverageVendingMachine() {
        this.beverages = new ArrayList<>();
    }

    public void addProduct(HotBeverage beverage) {
        beverages.add(beverage);
    }

    @Override
    public HotBeverage getProduct(String name, int volume, int temperature) {
        for (HotBeverage beverage : beverages) {
            if (beverage.getName().equals(name) &&
                    beverage.getVolume() == volume &&
                    beverage.getTemperature() == temperature) {
                return beverage;
            }
        }
        return null; // If no matching product is found
    }
}


