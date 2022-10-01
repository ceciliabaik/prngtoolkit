package cryptosystem.factory;

import java.math.BigInteger;

/**
 * @author Cecilia Baik
 */
public class KeyFactory {
    private BigInteger type;

    enum KeyType {
        PUBLIC, PRIVATE
    }

    public BigInteger getKey(KeyType type) {
        return switch (type) {
            case PUBLIC -> new PublicKey();
            case PRIVATE -> new PrivateKey();
        };
    }
}
