package creational;

import creational.abstractfactory_v2.*;

import static java.lang.System.out;

public class AbstractFactory_v2 {
    public static void main(String[] args) {
        System.out.println("===Create by type===");
        VehicleFactory factory = new GasolineVehicleFactory();
        out.println(factory.getVehicle("BUS"));
        out.println(factory.getVehicle("TRUCK"));
        System.out.println("===Create by method call===");
        factory = new DieselVehicleFactory();
        out.println(factory.getBus());
        out.println(factory.getTruck());
        System.out.println("===Create by method chain call===");
        out.println(FactoryProducer.getFactory(Fuel.ELECTRIC).getVehicle("BUS"));
        out.println(FactoryProducer.getFactory(Fuel.ELECTRIC).getVehicle("TRUCK"));
    }
}
