package tokenizer;

import tokenizer.lexicalGrammar.LexicalGrammar;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SearchPattern {
  private Pattern pattern;
  private Matcher matcher;
  private LexicalGrammar grammar;

  public Pattern defineSearchPattern() {
    String regex = grammar.getDescription();
    return Pattern.compile(regex);
  }

  public Matcher MatcherOfSearchPattern(String inputStream) {
    return pattern.matcher(inputStream);
  }

  public boolean hasSearchPatternMatch() {
      return matcher.matches();
  }
}

