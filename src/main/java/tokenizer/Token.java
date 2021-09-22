package tokenizer;

/**
 * A string that holds a series of characters, like a word or a phrase.
 */
public class Token {
    private String tokenName;
    private Integer tokenValue;

    public Token(String tokenName, Integer tokenValue) {
        this.tokenName = tokenName;
        this.tokenValue = tokenValue;
    }

    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public Integer getTokenValue() {
        return tokenValue;
    }

    public void setTokenValue(Integer tokenValue) {
        this.tokenValue = tokenValue;
    }
}
