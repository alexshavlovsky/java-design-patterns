package creational.abstractfactory_v2;

public abstract class Bus implements Vehicle {
    @Override
    public int getTax() {
        switch (getFuel()) {
            case GASOLINE:
                return 10;
            case DIESEL:
                return 12;
            case ELECTRIC:
                return 5;
        }
        throw new RuntimeException("Unknown bus fuel");
    }

    @Override
    public String toString() {
        return getFuel() + " BUS tax = " + getTax();
    }
}
