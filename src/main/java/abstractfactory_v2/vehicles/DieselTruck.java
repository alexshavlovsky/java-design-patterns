package abstractfactory_v2.vehicles;

import abstractfactory_v2.Fuel;
import abstractfactory_v2.Truck;

public class DieselTruck extends Truck {
    @Override
    public Fuel getFuel() {
        return Fuel.DIESEL;
    }
}
