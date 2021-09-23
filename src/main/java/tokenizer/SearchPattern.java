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

    public SearchPattern() {}

    public void defineSearchPattern() {
      Pattern pattern = Pattern.compile("([a-zåäöA-ZÅÄÖ]+)(.+)(\\S+)");
      Matcher matcher = pattern.matcher("Meningen består av ord.");
      boolean bool = matcher.matches();
      System.out.println(pattern);
      System.out.println(matcher);
      System.out.println(bool);
    }

    public Matcher getStringToMatchSearchPattern(String inputSourceCode) {
        return pattern.matcher(inputSourceCode);
    }

    public Boolean foundMatchesBetweenSearchPatternAndString() {
        return matcher.matches();
    }

    public Boolean foundSearchPatternInString() {
        return matcher.find();
    }

    public static void main(String[] args) {
      SearchPattern pattern = new SearchPattern();
      pattern.defineSearchPattern();
    }
}

