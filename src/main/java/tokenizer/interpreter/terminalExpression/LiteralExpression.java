package tokenizer.interpreter.terminalExpression;

import tokenizer.interpreter.SourceCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LiteralExpression extends TerminalExpression {
  private String literal;

  public LiteralExpression(String literal) {
    super();
    this.literal = literal;
  }

  public String getLiteralChar() {
    return "[a-zA-Z]";
  }

  @Override
  public boolean interpret(SourceCode context) {
    if (context.getInputStream().isEmpty()) {
      throw new NullPointerException("Input stream is empty.");
    } else {
      Pattern pattern = Pattern.compile(context.getInputStream());
      Matcher matcher = pattern.matcher(getLiteralChar());
      return matcher.matches();
    }
  }
}
