package prototype;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

class PrimeSieve implements Iterable<Integer> {

    private final LinkedList<Integer> primes;

    PrimeSieve() {
        primes = new LinkedList<>();
        primes.add(2);
        primes.add(3);
    }

    PrimeDecompose decompose(int i) {
        HashMap<Integer, Integer> res = new HashMap<>(2, 10);
        int n = i;
        for (int p : this) {
            if (n % p != 0) continue;
            int c = 0;
            while (n % p == 0) {
                n /= p;
                c++;
            }
            res.put(p, c);
            if (n == 1) break;
        }
        return new PrimeDecompose(i, res);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new PrimesIterator();
    }

    private int findNext() {
        int next = primes.getLast();
        outer:
        while (true) {
            next += 2;
            int max = (int) Math.pow(next, 0.5);
            for (int prime : primes) {
                if (prime > max) break;
                if (next % prime == 0) continue outer;
            }
            primes.add(next);
            return next;
        }
    }

    private class PrimesIterator implements Iterator<Integer> {

        private Iterator<Integer> iterator;

        private PrimesIterator() {
            iterator = primes.iterator();
        }

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            if (iterator == null) return findNext();
            if (iterator.hasNext()) return iterator.next();
            else {
                iterator = null;
                return findNext();
            }
        }

    }

}
