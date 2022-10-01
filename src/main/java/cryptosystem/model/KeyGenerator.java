package cryptosystem.model;

import cryptosystem.model.factory.PrivateKey;
import cryptosystem.model.factory.PublicKey;

import java.math.BigInteger;

public class KeyGenerator {
    private final PublicKey publicKey;
    private PrivateKey privateKey;
    private final ProbablePrime prime1;
    private final ProbablePrime prime2;
    private BigInteger phi;

    public KeyGenerator() {
        publicKey = new PublicKey();
        prime1 = new ProbablePrime();
        prime2 = new ProbablePrime();
    }

    public void generateKeyPair() {
        prime1.getRandomCandidateOfProbablePrime();
        prime2.getRandomCandidateOfProbablePrime();;

        publicKey.setModulus(getKeyLengthForModulus());
        setPhi(getCoprimeRangeForPhi());
        publicKey.setPublicExponent(getPublicExponentForKeyPair());

        privateKey.setPrivateExponent(getPrivateExponentForPrivateKey());
    }

    private BigInteger getKeyLengthForModulus() {
        return prime1.multiply(prime2);
    }

    public void setPhi(BigInteger phi) {}

    private BigInteger getCoprimeRangeForPhi() {
        BigInteger number1 = BigInteger.ONE;
        BigInteger subtractedPrime1 = prime1.subtract(number1);
        BigInteger subtractedPrime2 = prime2.subtract(number1);
        return (subtractedPrime1).multiply(subtractedPrime2);
    }

    private BigInteger getPublicExponentForKeyPair() {
        for (BigInteger publicExponent = 2; publicExponent < phi; publicExponent++) {
        }
        return null;
    }

    private boolean isGreatestCommonDivisor() {
        if (BigInteger.gcd(publicKey.getPublicExponent(), phi).equals(BigInteger.ONE)) {
            return true;
        }
    }

    private BigInteger findGreatestCommonDivisor() {
        !publicExponent.equals(BigInteger.ONE) ? prime1 : gcd(prime1, primeOne.mod(prime2));
    }

    private BigInteger getPrivateExponentForPrivateKey() {
        return PublicKey.getPublicExponent().modInverse(phi); // extended euclidean algorithm
    }
}

