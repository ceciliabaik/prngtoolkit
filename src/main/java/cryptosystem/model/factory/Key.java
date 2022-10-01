package cryptosystem.model.factory;

import java.math.BigInteger;

/**
 * @author Cecilia Baik
 */
public abstract class Key {
    private KeyType type;

    public Key(KeyType type) {
        this.type = type;
    }

    public Key() {}

    protected abstract void construct();

    public KeyType getType() {
        return type;
    }

    public void setType(KeyType type) {
        this.type = type;
    }
}
