package tokenizer;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SearchPattern {
  private LexicalGrammar grammar;
  private Tokenizer tokenizer;
  private boolean isPatternMatch;

  public boolean isPatternMatch() {
    return isPatternMatch;
  }

  public Pattern defineSearchPattern() {
      String regex = grammar.getDescription();
      return Pattern.compile(regex);
    }

  public Matcher MatcherOfSearchPattern(Pattern pattern) {
    String string = tokenizer.getString();
    return pattern.matcher(string);
  }

  public boolean hasSearchPatternMatch(Matcher matcher) {
    if (isPatternMatch()) {
      matcher.matches();
      return true;
    } else {
      return false;
    }
  }
}

