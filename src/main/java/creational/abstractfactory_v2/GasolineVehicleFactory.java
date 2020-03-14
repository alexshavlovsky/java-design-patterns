package creational.abstractfactory_v2;

import creational.abstractfactory_v2.vehicles.GasolineBus;
import creational.abstractfactory_v2.vehicles.GasolineTruck;

public class GasolineVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        switch (type) {
            case "TRUCK":
                return new GasolineTruck();
            case "BUS":
                return new GasolineBus();
        }
        return null;
    }
}
