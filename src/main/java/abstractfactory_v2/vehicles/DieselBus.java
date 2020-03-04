package abstractfactory_v2.vehicles;

import abstractfactory_v2.Bus;
import abstractfactory_v2.Fuel;

public class DieselBus extends Bus {
    @Override
    public Fuel getFuel() {
        return Fuel.DIESEL;
    }
}
