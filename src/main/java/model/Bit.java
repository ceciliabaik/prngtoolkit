package model;

public class Bit {
    private int bitLength;
    private final int MIN_BIT_LENGTH;

    public Bit(int bitLength) {
        this.bitLength = bitLength;
        MIN_BIT_LENGTH = bitLength - (bitLength / 2);
    }

    public int getBitLength() {
        return Math.max(bitLength, MIN_BIT_LENGTH);
    }

    public void setBitLength(int bitLength) {
        this.bitLength = bitLength;
    }
}
