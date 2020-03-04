package abstractfactory_v2.vehicles;

import abstractfactory_v2.Fuel;
import abstractfactory_v2.Truck;

public class ElectroTruck extends Truck {
    @Override
    public Fuel getFuel() {
        return Fuel.ELECTRIC;
    }
}
