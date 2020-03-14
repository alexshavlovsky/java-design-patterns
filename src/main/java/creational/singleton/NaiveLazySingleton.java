package creational.singleton;

public class NaiveLazySingleton {
    private static NaiveLazySingleton instance = null;

    private NaiveLazySingleton() {
        System.out.println("Inside constructor");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static NaiveLazySingleton getInstance() {
        if (instance == null) instance = new NaiveLazySingleton();
        return instance;
    }
}
