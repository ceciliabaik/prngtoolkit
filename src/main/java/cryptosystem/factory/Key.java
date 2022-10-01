package cryptosystem.factory;

import java.math.BigInteger;

/**
 * @author Cecilia Baik
 */
public interface Key {
    void createKey();
    BigInteger getType();
}
