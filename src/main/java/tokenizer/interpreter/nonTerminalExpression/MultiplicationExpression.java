package tokenizer.interpreter.nonTerminalExpression;

import tokenizer.interpreter.RegularExpression;
import tokenizer.interpreter.Interpreter;

import java.util.List;

public class MultiplicationExpression extends NonTerminalExpression {
  private String multiplication;
  private String head;
  private String body;

  public MultiplicationExpression(List<RegularExpression> subClassExpressions, String multiplication, String head, String body) {
    super(subClassExpressions);
    this.multiplication = multiplication;
    this.head = head;
    this.body = body;
  }

  public String getMultiplicationChar() {
      return "([a-zA-Z] | [0-9])";
    }

  @Override
  public boolean interpret(Interpreter context) {
  }
}
