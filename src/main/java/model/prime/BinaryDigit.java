package model.prime;

public class BinaryDigit {
    private int bitLength;
    private final int MIN_BIT_LENGTH;

    public BinaryDigit(int bitLength) {
        this.bitLength = bitLength;
        MIN_BIT_LENGTH = getBitLength() - (getBitLength() / 2);
    }

    public int getBitLength() {
        return Math.max(bitLength, MIN_BIT_LENGTH);
    }

    public void setBitLength(int bitLength) {
        this.bitLength = bitLength;
    }
}
