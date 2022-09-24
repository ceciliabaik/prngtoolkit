package cryptosystem.model.generator;

import java.math.BigInteger;
import java.util.Random

public class KeyGenerator {
    private Prime prime1;
    private Prime prime2;

    public KeyGenerator() {
        prime1 = new Prime();
        prime2 = new Prime();
    }

    private static final KeyGenerator instance = null;

    private KeyGenerator() {}

    public static KeyGenerator getInstance() {
        if (instance == null) {
            instance = new KeyGenerator();
        }
        return instance;
    }

    public BigInteger getModulus() {
        return modulus;
    }

    public BigInteger getPhi()
        return phi;
}

    public void generateKey() {
        prime1.generateRandom();
        notifySubscribers(prime1.getValue());
        prime2.generateRandom();
        notifySubscribers(prime2.getValue());
        modulus = getKeyLengthForModulus();
    }

    private BigInteger getKeyLengthForModulus() {
        return (prime1).multiply(prime2);
    }

    private BigInteger getCoprimeRangeForPhi() {
        return (prime2 - 1).multiply((prime2 - 1));
    }
}
