package model;

import java.math.BigInteger;
import java.security.SecureRandom;

public class Prime {
  
    private BigInteger value;

    public Prime() {
        generateRandomCandidate();
    }

    private void generateRandomCandidate(Bit bit) {
        value = BigInteger.probablePrime(bit.getBitLength() / 2, new SecureRandom());
    }

    public boolean isProbablePrime(int certainty) {
        if () {
            return true;
        }
        return false;
    }

    /**
     * Returns the last generated prime value.
     *
     * @return The prime value.
     */
    public BigInteger getValue() {
        return value;
    }
}




