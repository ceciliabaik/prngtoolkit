package tokenizer.interpreter.nonTerminalExpression;

import tokenizer.interpreter.RegularExpression;
import tokenizer.interpreter.Interpreter;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdditionExpression extends NonTerminalExpression {
  private String addition;

  public AdditionExpression(List<RegularExpression> subClassExpressions, String addition) {
    super(subClassExpressions);
    this.addition = addition;
  }

  public String additionChar() {
    addition = "+";
    return addition;
  }

  @Override
  public boolean interpret(Interpreter context) {
    for (RegularExpression expression : getSubClassExpressions()) {
      Pattern pattern = Pattern.compile(context.getInputStream());
      Matcher matcher = pattern.matcher(additionChar());
      return matcher.matches();
    }
  }
}
