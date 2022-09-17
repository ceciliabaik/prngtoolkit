package cryptosystem.key;

import cryptosystem.primality.PrimalityTest;

/**
 * Represents a Miller-Rabin Primality Test.
 * Generates large prime numbers.
 *
 * @version     1.0.0 17 September 2022
 * @author      Cecilia Baik
 */
public class KeyPair {
    private final PrimalityTest primeNumberOne;
    private final PrimalityTest primeNumberTwo;
    private int modulus;

    public KeyPair(PrimalityTest primeNumberOne, PrimalityTest primeNumberTwo, int modulus) {
        this.primeNumberOne = primeNumberOne;
        this.primeNumberTwo = primeNumberTwo;
        this.modulus = modulus
    }

    public int getModulus() {
        return modulus;
    }

    public void setModulus(int modulus) {
        this.modulus = modulus;
    }

    private int getPhi () {
        return this.computePhi();
    }

    private int computeKeyLength() {
        return this.primeNumberOne * this.primeNumberTwo;
    }

    private int computePhi() {
        return (this.primeNumberOne - 1) * (this.primeNumberTwo - 1)
    }
}
