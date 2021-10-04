package tokenizer.scanner;

public class ScannerContext {
  private FiniteStateMachine state;
  private String inputStream;

  public ScannerContext(FiniteStateMachine state, String inputStream) {
    this.state = state;
    this.inputStream = inputStream;
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

  public void setInputStream(String inputStream) { 
    this.inputStream = inputStream;
  }
}
