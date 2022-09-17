package croyptosystem.key;

public class PublicKey extends KeyPair {
    private int publicExponent;
    private KeyPair keyPair;

    public PublicKey (int modulus, int publicExponent) {
        super(modulus);
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