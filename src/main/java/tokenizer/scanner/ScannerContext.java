package tokenizer.scanner;

public class ScannerContext {
  String sourceCode;
  private FiniteStateAutomaton state;

  public ScannerContext(String sourceCode) {
    this.sourceCode = sourceCode;
    state = InitialState.instance();
  }

  public ScannerContext() {
  }

  public String getSourceCode() {
    return sourceCode;
  }

  public FiniteStateAutomaton getState() {
    return state;
  }

  public void setState(FiniteStateAutomaton state) {
    this.state = state;
  }

  public void transition(String sourceCode) {
    state.transition(this, sourceCode);
  }
}
