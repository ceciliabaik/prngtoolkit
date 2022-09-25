package cryptosystem.model;

import java.math.BigInteger;
import java.util.Random;

/**
 * @author Cecilia Baik
 */
public class KeyGenerator {
    private ProbablePrime prime1;
    private ProbablePrime prime2;
    private BigInteger modulus;
    private BigInteger publicExponent;
    private BigInteger phi;

    public enum KeyGenerator {
        INSTANCE
    }

    public KeyGenerator() {
        prime1 = new ProbablePrime();
        prime2 = new ProbablePrime();
    }

    public void generateKeyPair() {
        do {
            prime1.generateRandom();
            prime2.generateRandom();
            modulus = getKeyLengthForModulus();
            phi = getCoprimeRangeForPhi();
            publicExponent = getPublicExponentForKeyPair();
        } while (!prime1.equals(prime2);
        return (modulus, phi, publicExponent);
    }

    private BigInteger getKeyLengthForModulus() {
        return (prime1).multiply(prime2);
    }

    private BigInteger getCoprimeRangeForPhi() {
        return (prime2 - 1).multiply((prime2 - 1));
    }

    private BigInteger getPublicExponentForKeyPair() {
        for (publicExponent = 2; publicExponent < phi; publicExponent++) {
            if (isGreatestCommonDivisor()) {
                return publicExponent;
            }
        }
    }

    private boolean isGreatestCommonDivisor() {
        if (greatestCommonDivisor = gcd(publicExponent, phi) == 1) return true;
    }

    private BigInteger findGreatestCommonDivisor() {
        greatestCommonDivisor = gcd(prime1, primeOne.mod(prime2);
        return prime2.equals(0) ? prime1 : greatestCommonDivsor);
    }

    private BigInteger getPrivateExponentForPrivateKey() {
        return publicExponent.modInverse(phi); // extended eucledian algorithm
    }
}
