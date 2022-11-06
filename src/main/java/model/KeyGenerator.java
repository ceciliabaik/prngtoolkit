package model;

import java.math.BigInteger;

public class KeyGenerator {
    private PublicKey publicKey;
    private PrivateKey privateKey;
    private Prime prime1;
    private Prime prime2;

    public BigInteger generateKeyPair() {
        prime1 = new Prime();
        prime2 = new Prime();
        while (!isPrimeEven()) {
            publicKey.calcKeyLengthFoModulus(prime1, prime2);
            publicKey.calcCoprimeRangeForPhi(prime1, prime2);
            publicKey.calcExponent();
            privateKey.calcExponent(publicKey);
        }
        return BigInteger.valueOf(0);
    }

    private boolean isPrimeEven() {
        if (prime1.getValue().equals(prime2.getValue())) {
            return true;
        }
        return false;
    }

    public PublicKey getPublicKey() {
        return publicKey;
    }

    public PrivateKey getPrivateKey() {
        return privateKey;
    }
}
