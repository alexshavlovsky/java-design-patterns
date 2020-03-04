package abstractfactory_v2;

import abstractfactory_v2.vehicles.ElectroBus;
import abstractfactory_v2.vehicles.ElectroTruck;

public class ElectroVehicleFactory extends VehicleFactory {
    @Override
    public Vehicle getVehicle(String type) {
        switch (type) {
            case "TRUCK":
                return new ElectroTruck();
            case "BUS":
                return new ElectroBus();
        }
        return null;
    }
}
