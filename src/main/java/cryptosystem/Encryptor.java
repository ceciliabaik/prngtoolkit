package cryptosystem;

import java.math.BigInteger;

public class Encryptor {
    
    public Encryptor() {
    }

    public BigInteger encrypt(BigInteger publicExponent, BigInteger modulus) {
        return message.modPow(publicExponent, modulus);
    }
}
