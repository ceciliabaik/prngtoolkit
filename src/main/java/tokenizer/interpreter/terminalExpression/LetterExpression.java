package tokenizer.interpreter.terminalExpression;

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
  public int interpret() {
    return 0;
  }
}
