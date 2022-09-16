package cryptosystem.key;

import cryptosystem.primality.PrimalityTest;

public class KeyPair {
    private final PrimalityTest primeNumberOne;
    private final PrimalityTest primeNumberTwo;

    public KeyPair(PrimalityTest primeNumberOne, PrimalityTest primeNumberTwo) {
        this.primeNumberOne = primeNumberOne;
        this.primeNumberTwo = primeNumberTwo;
    }

    private int getModulus () {
        return computedKeyLength();
    }

    private int getPhi () {
        return computePhi();
    }

    private int computeKeyLength() {
        return primeNumberOne * primeNumberTwo;
    }

    private int computePhi() {
        return (this.primeNumberOne - 1) * (this.primeNumberTwo - 1)
    }
}
