package cryptosystem.crypto;

import java.math.BigInteger;

/**
 * @author Cecilia Baik
 */
public interface Cryptosystem {
    public BigInteger encrypt(BigInteger message);
    public BigInteger decrypt(BigInteger ciphertext);
}
