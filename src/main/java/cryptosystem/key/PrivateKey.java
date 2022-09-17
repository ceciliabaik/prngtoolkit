package cryptosystem.key;

/**
 * Represents a Miller-Rabin Primality Test.
 * Generates large prime numbers.
 *
 * @version     1.0.0 17 September 2022
 * @author      Cecilia Baik
 */
public class PrivateKey extends KeyPair {
    private int privateExponent;

    public PrivateKey(int modulus, int privateExponent) {
        super(modulus);
        this.privateExponent = privateExponent;
    }

    private int getPrivateExponent() {
        return computePrivateExponent();
    }

    private int computePrivateExponent() {
        return int this.privateExponent * publicKey.getPublicExponent() = 1 % KeyPair.getPhi()
    }
}