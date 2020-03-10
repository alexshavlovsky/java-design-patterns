import prototype.DecomposeCache;
import prototype.PrimeDecompose;

public class Prototype {

    // It makes no sense to cache prime decompositions this way
    // This has been done just for a prototype cloning demonstration purpose
    private static final int LIMIT = 300000;
    private static final DecomposeCache cache = new DecomposeCache(LIMIT);

    public static void main(String[] args) throws InterruptedException {
        PrimeDecompose dec1 = cache.getDecompositionDeepCopy(4 * 5 * 9 * 7 * 11 * 13);
        PrimeDecompose dec2 = cache.getDecompositionDeepCopy(4 * 5 * 9 * 7 * 11 * 13);
        System.out.println(dec1 == dec2);
        System.out.println(dec1.getDecomposeMap() == dec2.getDecomposeMap());
        System.out.println(dec1);
        System.out.println(dec2);

        System.out.println("===deep cloning benchmark===");
        Runtime.getRuntime().gc();
        Thread.sleep(500);
        long t = System.currentTimeMillis();
        int z = 0;
        for (int i = 2; i < LIMIT; i++) z += cache.getDecompositionDeepCopy(i).getDecomposeMap().size();
        System.out.println(System.currentTimeMillis() - t + " ms");
        System.out.println((double) z / LIMIT);

        System.out.println("===direct cache access benchmark===");
        Runtime.getRuntime().gc();
        Thread.sleep(500);
        t = System.currentTimeMillis();
        z = 0;
        for (int i = 2; i < LIMIT; i++) z += cache.getDecompositionByReference(i).getDecomposeMap().size();
        System.out.println(System.currentTimeMillis() - t + " ms");
        System.out.println((double) z / LIMIT);
    }
}
