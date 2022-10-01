package cryptosystem.model.factory;

/**
 * @author Cecilia Baik
 */
public class KeyFactory {

    public static Key buildKey(KeyType type) {
        return switch (type) {
            case PUBLIC -> new PublicKey();
            case PRIVATE -> new PrivateKey();
        };
    }
}
