package tokenizer.interpreter.nonTerminalExpression;

import tokenizer.interpreter.RegularExpression;
import tokenizer.interpreter.Interpreter;

import java.util.List;

public class WhiteSpaceExpression extends NonTerminalExpression {
  String whitespace;

  public WhiteSpaceExpression(List<RegularExpression> subClassExpressions, String whitespace) {
    super(subClassExpressions);
    this.whitespace = whitespace;
  }

  public WhiteSpaceExpression(String whitespace) {
    this.whitespace = whitespace;
  }

  public String getWhiteSpace() {
    return "";
  }

  @Override
  public boolean interpret(Interpreter context) {
  }
}
