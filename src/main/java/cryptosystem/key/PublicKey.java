public class PublicKey extends KeyPair {
    private int publicExponent

    public PublicKey (int publicExponent) {
        this.publicExponent = publicExponent;
    }

    public int getPublicKey () {
        return publicKey;
    }

    private int computePublicExponent () {
    }

    private int findCoPrimeToPhi () {
    }
}