package tokenizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SearchPattern {
  private Pattern pattern;
  private Matcher matcher;
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

  public Matcher MatcherOfSearchPattern() {
    String string = tokenizer.getString();
    return pattern.matcher(string);
  }

  public boolean hasSearchPatternMatch() {
    if (isPatternMatch()) {
      matcher.matches();
      return true;
    } else {
      return false;
    }
  }

  public void moveActiveTokenBackwards() {
    ArrayList<String> tokens = new ArrayList<>(Arrays.asList("Meningen", "består", "av", "ord", "."));
    for (int i = 0; i < tokens.size(); i++) {
      if (i == 2) {
        break;
      }
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    SearchPattern pattern = new SearchPattern();
    pattern.moveActiveTokenBackwards();
  }
}

