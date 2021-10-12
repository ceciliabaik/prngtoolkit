package tokenizer.scanner;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ScannerContext {
  private FiniteStateMachine state;
  private String inputStream;
  private String regexPattern;

  public ScannerContext(FiniteStateMachine state, String inputStream, String regexPattern) {
    this.state = state;
    this.inputStream = inputStream;
    this.regexPattern = regexPattern;
  }

  public FiniteStateMachine getState() {
    return state;
  }

  public void setState(FiniteStateMachine state) { 
    this.state = state;
  }

  public String getInputStream() {
    return inputStream;
  }

  public Boolean matchWithPattern() {
    Pattern pattern = Pattern.compile(regexPattern);
    Matcher matcher = pattern.matcher(inputStream);
    return matcher.matches();
  }
}
