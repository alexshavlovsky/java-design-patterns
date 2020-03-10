package prototype;

public class DecomposeCache {
    private final PrimeDecompose[] cache;

    public DecomposeCache(int limit) {
        PrimeSieve primeSieve = new PrimeSieve();
        cache = new PrimeDecompose[limit];
        for (int i = 2; i < limit; i++) cache[i] = primeSieve.decompose(i);
    }

    public PrimeDecompose getDecompositionDeepCopy(int i) {
        try {
            return cache[i].clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public PrimeDecompose getDecompositionByReference(int i) {
        return cache[i];
    }
}
