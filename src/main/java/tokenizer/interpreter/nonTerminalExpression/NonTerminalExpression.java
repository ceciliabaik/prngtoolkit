package tokenizer.interpreter.nonTerminalExpression;

import java.util.ArrayList;
import java.util.List;

import tokenizer.interpreter.RegularExpression;

public abstract class NonTerminalExpression implements RegularExpression {
  private List<RegularExpression> subClassExpressions = new ArrayList<>();

  public NonTerminalExpression(List<RegularExpression> subClassExpressions) {
    super();
    this.subClassExpressions = subClassExpressions;
  }

  public List<RegularExpression> getSubClassExpressions() {
    return subClassExpressions;
  }
}
