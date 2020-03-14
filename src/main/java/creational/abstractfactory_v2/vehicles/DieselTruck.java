package creational.abstractfactory_v2.vehicles;

import creational.abstractfactory_v2.Fuel;
import creational.abstractfactory_v2.Truck;

public class DieselTruck extends Truck {
    @Override
    public Fuel getFuel() {
        return Fuel.DIESEL;
    }
}
