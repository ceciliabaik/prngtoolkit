package tokenizer.scanner;

public abstract class SuperState implements State {
  protected Tokenizer tokenizer;

  public SuperState(Tokenizer tokenizer) {
    this.tokenizer = tokenizer;
  }

  public SuperState() {}

  @Override
  public void updateState() {}
}
