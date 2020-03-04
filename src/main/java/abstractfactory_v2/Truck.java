package abstractfactory_v2;

public abstract class Truck implements Vehicle {
    @Override
    public int getTax() {
        switch (getFuel()) {
            case GASOLINE:
                return 15;
            case DIESEL:
                return 17;
            case ELECTRIC:
                return 7;
        }
        throw new RuntimeException("Unknown truck fuel");
    }

    @Override
    public String toString() {
        return getFuel() + " TRUCK tax = " + getTax();
    }
}
