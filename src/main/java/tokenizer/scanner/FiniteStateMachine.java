package tokenizer.scanner;

public interface FiniteStateMachine {
  public void performTransition(ScannerContext context, String inputStream);
}
