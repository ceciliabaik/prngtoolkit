package cryptosystem;

import java.math.BigInteger;

public class KeyGenerator {
    private final ProbablePrime prime1;
    private final ProbablePrime prime2;
    private BigInteger publicExponent;
    private BigInteger modulus;
    private BigInteger phi;

    public KeyGenerator() {
        prime1 = new ProbablePrime();
        prime2 = new ProbablePrime();
    }

    public void generateKeyPair() {
        prime1.getRandomCandidateOfProbablePrime();
        prime2.getRandomCandidateOfProbablePrime();;
        setModulus(this.getKeyLengthForModulus());
        setPhi(this.getRelativePrimeRangeForPhi());
        setPublicExponent(this.getPublicExponentForKeyPair());
    }

    private void setModulus(BigInteger modulus) {
        this.modulus = modulus;
    }

    private BigInteger getKeyLengthForModulus() {
        return prime1.multiply(prime2);
    }

    private void setPhi(BigInteger phi) {
        this.phi = phi;
    }

    private BigInteger getRelativePrimeRangeForPhi() {
        BigInteger subtractedPrime1 = prime1.subtract(BigInteger.ONE);
        BigInteger subtractedPrime2 = prime2.subtract(BigInteger.ONE);
        return (subtractedPrime1).multiply(subtractedPrime2);
    }

    private void setPublicExponent(BigInteger publicExponent) {
        this.publicExponent = publicExponent;
    }

    private BigInteger getPublicExponentForKeyPair() {
        for (int i = 2; i < phi; i++) {
        }
    }

    private void setPrivateExponent(BigInteger privateExponent) {
        this.privateExponent = privateExponent;
    }

    private boolean isGreatestCommonDivisor() {
        if (greatestCommonDivisor = gcd(publicExponent, phi) == 1) return true;
    }

    private BigInteger findGreatestCommonDivisor() {
        Object greatestCommonDivisor = gcd(prime1, primeOne.mod(prime2);
        return prime2.equals(0) ? prime1 : greatestCommonDivsor);
    }

    private BigInteger getPrivateExponentForPrivateKey(BigInteger phi) {
        return publicExponent.modInverse(phi); // extended euclidean algorithm
    }
}

