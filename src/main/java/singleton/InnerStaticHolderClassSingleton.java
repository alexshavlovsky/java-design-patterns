package singleton;

public class InnerStaticHolderClassSingleton {
    private InnerStaticHolderClassSingleton() {
        System.out.println("Inside constructor");
    }

    private static class InstanceHolder {
        static InnerStaticHolderClassSingleton instance = new InnerStaticHolderClassSingleton();
    }

    public static InnerStaticHolderClassSingleton getInstance() {
        return InstanceHolder.instance;
    }
}
