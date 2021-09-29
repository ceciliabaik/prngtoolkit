package tokenizer.finiteStateMachine;

public class NextState implements State {
  private Context context;
  private String inputStream;

  public NextState(String inputStream) {
    this.inputStream = inputStream;
  }

  @Override
  public void performTransition() {
    for (int i = 0; i < inputStream.length(); i++) 
      repeatTransition();
  }

  public void repeatTransition() {}

  @Override
  public void foundCharacterMatch() {
  }
}
