import singleton.NaiveLazySingleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NaiveLazySingletonBreaking {
    private static void getSoleInstance() {
        NaiveLazySingleton i = NaiveLazySingleton.getInstance();
        System.out.println(i);
    }

    public static void main(String[] args) {
        ExecutorService e = Executors.newFixedThreadPool(2);
        e.execute(NaiveLazySingletonBreaking::getSoleInstance);
        e.execute(NaiveLazySingletonBreaking::getSoleInstance);
        e.shutdown();
    }
}
