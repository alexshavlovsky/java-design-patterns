package creational;

import creational.singleton.InnerStaticHolderClassSingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InnerStaticHolderClassSingletonTest {
    private static void getSoleInstance() {
        InnerStaticHolderClassSingleton i = InnerStaticHolderClassSingleton.getInstance();
        System.out.println(i);
    }

    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(2);
        e.execute(InnerStaticHolderClassSingletonTest::getSoleInstance);
        e.execute(InnerStaticHolderClassSingletonTest::getSoleInstance);
        e.shutdown();
    }
}
