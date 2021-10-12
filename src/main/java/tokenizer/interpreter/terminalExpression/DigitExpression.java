package tokenizer.interpreter.terminalExpression;

import tokenizer.interpreter.SourceCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitExpression extends TerminalExpression {
  private int number;

  public DigitExpression(int number) {
    super();
    this.number = number;
  }

  public String getDigitChar() {
    return "[0-9]";
  }

  @Override
  public boolean interpret(SourceCode searchPattern) {
    Pattern pattern = Pattern.compile(searchPattern.getInputStream());
    Matcher matcher = pattern.matcher(getDigitChar());
    return matcher.matches();
  }
}
