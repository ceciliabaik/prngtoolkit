public class PrivateKey extends KeyPair {
    private int privateExponent;

    public PrivateKey(int privateExponent) {
        this.privateExponent = privateExponent;
    }

    public int getPrivateKey() {
        return privateKey;
    }

    private int computePrivateExponent() {
        return int privateExponent * publicKey.getpublicExponent() = 1 % KeyPair.getPhi()
    }
}