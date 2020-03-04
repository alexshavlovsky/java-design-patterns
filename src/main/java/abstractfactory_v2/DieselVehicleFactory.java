package abstractfactory_v2;

import abstractfactory_v2.vehicles.DieselBus;
import abstractfactory_v2.vehicles.DieselTruck;

public class DieselVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        switch (type) {
            case "TRUCK":
                return new DieselTruck();
            case "BUS":
                return new DieselBus();
        }
        return null;
    }
}
