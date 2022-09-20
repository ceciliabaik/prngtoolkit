package croyptosystem.generator;

public class PublicKey implements Key {
    private BigInteger publicExponent;

    public PublicKey (BigInteger publicExponent) {
        this.publicExponent = publicExponent;
    }

    @Override
    public BigInteger getExponent() {
        for (this.publicExponent = 2; this.publicExponent < phi; this.publicExponent++) {
            if (greatestCommonDivisor(this.publicExponent, phi) == 1) {
                return this.publicExponent;
            }
        }
    }
}