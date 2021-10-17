package tokenizer.scanner;

public interface FiniteStateAutomaton {
  void transition(ScannerContext context, String sourceCode);
}
