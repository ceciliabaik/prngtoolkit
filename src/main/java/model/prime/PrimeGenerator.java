package model;

public class PrimeGenerator {
    private Prime prime1;
    private Prime prime2;

    public PrimeGenerator() {

    }

    public boolean generatePrimes() {
        if (!isPrimeEven()) {
            prime1 = new Prime();
            prime2 = new Prime();
        }
        return false;
    }

    private boolean isPrimeEven() {
        if (prime1.getValue().equals(prime2.getValue())) {
            return true;
        }
        return false;
    }
}
