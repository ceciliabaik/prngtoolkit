package tokenizer;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * SearchPattern class utilizes regular expressions, which are defined
 * as patterns used to match character combinations in strings. Also
 * explained as a series of characters that specifies a search pattern.
 */
public class SearchPattern {
    private Pattern pattern;
    private Matcher matcher;

    public SearchPattern(Pattern pattern, Matcher matcher) {
        this.pattern = pattern;
        this.matcher = matcher;
    }

    public Pattern createPatternToUseInSearch(String inputSourceCode) {
        return Pattern.compile(inputSourceCode);
    }

    public Matcher searchForPatternInString(String inputSourceCode) {
        return pattern.matcher(inputSourceCode);
    }

    public Boolean foundPatternInString() {
        return matcher.find();
    }
}

