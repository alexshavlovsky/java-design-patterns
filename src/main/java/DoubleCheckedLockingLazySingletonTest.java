import singleton.DoubleCheckedLockingLazySingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DoubleCheckedLockingLazySingletonTest {
    private static void getSoleInstance() {
        DoubleCheckedLockingLazySingleton i = DoubleCheckedLockingLazySingleton.getInstance();
        System.out.println(i);
    }

    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(2);
        e.execute(DoubleCheckedLockingLazySingletonTest::getSoleInstance);
        e.execute(DoubleCheckedLockingLazySingletonTest::getSoleInstance);
        e.shutdown();
    }
}
