package tokenizer.lexicalGrammar;

import tokenizer.tokenizer.TokenType;

public class Regex extends LexicalGrammar {
    public Regex(TokenType tokenType, String description) {
        super(tokenType, description);
    }

    public String getDescription() {
        return description;
    }

    public String literalRegex() {
        description = "([a-zåäöA-ZÅÄÖ]*)\\s*(.*)(!*)\\?*(:*)(;*)(,*)";
        return description;
    }

    public String arithmeticRegex() {
        description = "";
        return description;
    }

    public String javaRegex() {
        description = "";
        return description;
    }

    public String javaScriptRegex() {
        description = "";
        return description;
    }

    public String whiteSpaceRegex() {
        description = "";
        return description;
    }
}
