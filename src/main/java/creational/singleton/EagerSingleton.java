package creational.singleton;

import java.io.Serializable;

public class EagerSingleton implements Serializable, Cloneable {
    private static EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {
        System.out.println("Inside Constructor");
    }

    public static EagerSingleton getInstance() {
        return INSTANCE;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
