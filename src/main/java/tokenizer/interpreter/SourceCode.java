package tokenizer.interpreter;

public class SourceCode {
  private String inputStream;

  public SourceCode(String inputStream) {
    this.inputStream = inputStream;
  }

  public String getInputStream() {
    return inputStream;
  }

  public void setInputStream(String inputStream) {
    this.inputStream = inputStream;
  }

  public void traverseAbstractSyntaxTree() {
    // Use the iterator pattern.
  }
}
