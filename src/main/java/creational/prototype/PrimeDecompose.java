package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class PrimeDecompose implements Cloneable {
    private int number;
    private HashMap<Integer, Integer> decomposeMap;

    PrimeDecompose(int number, HashMap<Integer, Integer> decomposeMap) {
        this.number = number;
        this.decomposeMap = decomposeMap;
    }

    public int getNumber() {
        return number;
    }

    public Map<Integer, Integer> getDecomposeMap() {
        return decomposeMap;
    }

    @Override
    @SuppressWarnings("unchecked")
    protected PrimeDecompose clone() throws CloneNotSupportedException {
        // deep cloning
        PrimeDecompose decomposition = (PrimeDecompose) super.clone();
        decomposition.decomposeMap = (HashMap<Integer, Integer>) decomposeMap.clone();
        return decomposition;
    }

    @Override
    public String toString() {
        return "PrimeDecomposition{" +
                "number=" + number +
                ", decomposeMap=" + decomposeMap +
                '}';
    }
}
