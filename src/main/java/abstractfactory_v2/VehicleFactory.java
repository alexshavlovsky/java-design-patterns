package abstractfactory_v2;

public abstract class VehicleFactory implements VehicleFactoryInterface {
    public Vehicle getBus() {
        return getVehicle("BUS");
    }

    public Vehicle getTruck() {
        return getVehicle("TRUCK");
    }
}
