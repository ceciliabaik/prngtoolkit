import java.util.stream.IntStream;

public class Cryptosystem {
    private String plainText;
    private KeyPair publicKey;
    private KeyPair privateKey;

    public Cryptosystem(String plainText) {
        this.plainText = plainText
    }

    public int encrypt (PublicKey publicKey) {
        return Math.pow(this.plainText, publicKey.getPublicExponent()) % publicKey.getModulus();
    }

    public int decrypt (PrivateKey privateKey , cipherText) {
        return Math.pow(cipherText, privateKey.getPrivateExponent() % privateKey.getModulus()
    }

    private int reduceToLargeNumber () {
        int sum = Arrays.stream(asciiCodeList).reduce(0, left, right)
    }

    private char convertToASCII () {
        ArrayList<Integer> asciiCodeList = new ArrayList<>();
        for (int i = 0; i < this.plainText.length; i++) {
            char character = this.plainText.charAt(i)
            return asciiCodeList.add(i);
        }
    }

    private char convertToCharacter (ArrayList<Integer> asciiCodeList) {
        for (int i = 0; i < asciiCodeList.length; i++) {
            return char[] asciiCode = Character.toString(i);
        }
    }
}





















