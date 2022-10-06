package cryptosystem.crypto;

import cryptosystem.model.prime.ProbablePrime;

import java.math.BigInteger;

/**
 * @author Cecilia Baik
 */
public class KeyGenerator {
    private final ProbablePrime prime1;
    private final ProbablePrime prime2;
    private BigInteger phi;

    public KeyGenerator(BigInteger phi) {
        this.phi = phi;
        prime1 = new ProbablePrime();
        prime2 = new ProbablePrime();
        setPhi(BigInteger.ZERO);
    }

    public void generateKey() {
        do {
        prime1.generateRandomCandidate();
        } while (prime1.getValue().remainder(publicKey.getExponent()).equals(BigInteger.ONE));

        do {
            prime2.generateRandomCandidate();
        } while (prime2.getValue().remainder(publicKey.getExponent()).equals(BigInteger.ONE));
        publicKey.setModulus(getKeyLengthForModulus());
        setPhi(getCoprimeRangeForPhi());
        publicKey.setExponent(computePublicExponent());
        privateKey.setExponent(computePrivateExponent());
    }

    private BigInteger getKeyLengthForModulus() throws ArithmeticException {
        return prime1.getValue().multiply(prime2.getValue());
    }

    private BigInteger getCoprimeRangeForPhi() throws ArithmeticException {
        BigInteger subtractedPrime1 = prime1.getValue().subtract(BigInteger.ONE);
        BigInteger subtractedPrime2 = prime2.getValue().subtract(BigInteger.ONE);
        phi = (subtractedPrime1).multiply(subtractedPrime2);
        return phi;
    }

    private BigInteger computePublicExponent() {
    }

    /**
     * Extended euclidean algorithm.
     */
    private BigInteger computePrivateExponent() {
        return getPublicKey().modInverse(this.getPhi());
    }

    public BigInteger getPhi() {
        return phi;
    }

    public void setPhi(BigInteger phi) {
        this.phi = phi;
    }
}

