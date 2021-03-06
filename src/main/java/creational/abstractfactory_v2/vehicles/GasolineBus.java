package creational.abstractfactory_v2.vehicles;

import creational.abstractfactory_v2.Bus;
import creational.abstractfactory_v2.Fuel;

public class GasolineBus extends Bus {
    @Override
    public Fuel getFuel() {
        return Fuel.GASOLINE;
    }
}
