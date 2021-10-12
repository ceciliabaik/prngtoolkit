package tokenizer.interpreter.terminalExpression;

import tokenizer.interpreter.SearchPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AlphaExpression extends TerminalExpression {
  private String alpha;

  public AlphaExpression(String alpha) {
    super();
    this.alpha = alpha;
  }

  public String getAlphaChar() {
    return "([a-zA-Z] | [0-9])";
  }

  @Override
  public boolean interpret(SearchPattern context) {
    Pattern pattern = Pattern.compile(context.getInputStream());
    Matcher matcher = pattern.matcher(getAlphaChar());
    return matcher.matches();
 
}
