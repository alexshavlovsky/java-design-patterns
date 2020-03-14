package creational.singleton;

public class DoubleCheckedLockingLazySingleton {
    private static volatile DoubleCheckedLockingLazySingleton instance;

    private DoubleCheckedLockingLazySingleton() {
        System.out.println("Inside constructor");
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static DoubleCheckedLockingLazySingleton getInstance() {
        if (instance == null) synchronized (DoubleCheckedLockingLazySingleton.class) {
            if (instance == null) instance = new DoubleCheckedLockingLazySingleton();
        }
        return instance;
    }
}
