package tokenizer.interpreter.nonTerminalExpression;

import tokenizer.interpreter.RegularExpression;
import tokenizer.interpreter.Interpreter;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EndExpression extends NonTerminalExpression {
  private String end;

  public EndExpression(List<RegularExpression> subClassExpressions, String end) {
    super(subClassExpressions);
    this.end = end;
  }

  public String endChar() {
    return " ";
  }

  @Override
  public boolean interpret(Interpreter context) {
    for (RegularExpression expression : getSubClassExpressions()) {
      Pattern pattern = Pattern.compile(context.getInputStream());
      Matcher matcher = pattern.matcher(endChar());
      return matcher.matches();
    }
  }
}
