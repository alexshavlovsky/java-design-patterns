package abstractfactory_v2;

public class FactoryProducer {
    public static VehicleFactoryInterface getFactory(Fuel fuel) {
        switch (fuel) {
            case GASOLINE:
                return new GasolineVehicleFactory();
            case DIESEL:
                return new DieselVehicleFactory();
            case ELECTRIC:
                return new ElectroVehicleFactory();
        }
        throw new RuntimeException("Unsupported fuel type");
    }
}
