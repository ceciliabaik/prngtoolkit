package cryptosystem.model.key;

import cryptosystem.model.prime.ProbablePrime;

import java.math.BigInteger;

public class KeyGenerator {
    private PublicKey publicKey;
    private PrivateKey privateKey;
    private ProbablePrime prime1;
    private ProbablePrime prime2;
    private BigInteger phi;

    public KeyGenerator(PublicKey publicKey, PrivateKey privateKey, BigInteger phi) {
        this.publicKey = publicKey;
        this.privateKey = privateKey;
        this.phi = phi;
    }

    public KeyGenerator() {
        prime1 = new ProbablePrime();
        prime2 = new ProbablePrime();
    }

    public void generateKeyPair() {
        this.selectTwoPrimeNumbers();
        while (!isPrimeEven()) {
            publicKey.setModulus(this.computeKeyLengthForModulus());
            this.setPhi(this.computeCoprimeRangeForPhi());
            publicKey.setExponent(this.findPublicExponent());
            privateKey.setExponent(this.findPrivateExponent());
        }
    }

    private void selectTwoPrimeNumbers() {
        do {
            prime1.generateRandomCandidate();
        } while (prime1.getValue().remainder(publicKey.getExponent()).equals(BigInteger.ONE));

        do {
            prime2.generateRandomCandidate();
        } while (prime2.getValue().remainder(publicKey.getExponent()).equals(BigInteger.ONE));
    }

    private boolean isPrimeEven() {
        return prime1.getValue().equals(prime2.getValue());
    }

    private BigInteger computeKeyLengthForModulus() throws ArithmeticException {
        return prime1.getValue().multiply(prime2.getValue());
    }

    private BigInteger computeCoprimeRangeForPhi() throws ArithmeticException {
        BigInteger subtractedPrime1 = prime1.getValue().subtract(BigInteger.ONE);
        BigInteger subtractedPrime2 = prime2.getValue().subtract(BigInteger.ONE);
        phi = (subtractedPrime1).multiply(subtractedPrime2);
        return phi;
    }

    private BigInteger findPublicExponent() throws ArithmeticException {
        BigInteger publicExponent = BigInteger.valueOf(0);
        while (isGreatestCommonDivisor() && isLessThanPhiAndGreaterThanOne()) {
            publicExponent = BigInteger.valueOf(65537);
        }
        return publicExponent;
    }

    private boolean isGreatestCommonDivisor() {
        return this.getPhi().gcd(publicKey.getExponent()).compareTo(BigInteger.ONE) > 0;
    }

    private boolean isLessThanPhiAndGreaterThanOne() {
        return publicKey.getExponent().compareTo(BigInteger.ONE) > 0;
    }

    /**
     * Extended euclidean algorithm.
     */
    public BigInteger findPrivateExponent() throws ArithmeticException {
        return publicKey.getExponent().modInverse(this.getPhi());
    }

    public BigInteger getPhi() {
        return phi;
    }

    public void setPhi(BigInteger phi) {
        this.phi = phi;
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }

    @Override
    public String toString() {
        return "KeyGenerator{" +
                "publicKey=" + publicKey +
                ", privateKey=" + privateKey +
                ", prime1=" + prime1 +
                ", prime2=" + prime2 +
                ", phi=" + phi +
                '}';
    }
}
