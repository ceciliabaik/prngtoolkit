package tokenizer.finiteStateMachine;

import tokenizer.Lexeme;

public class AcceptState implements State {
  private Context context;
  private String inputStream;

  public AcceptState(String inputStream) {
    this.inputStream = inputStream;
  }

  @Override
  public void performTransition() {
    for (int i = 0; i < inputStream.length(); i++);
  }

  @Override
  public void foundCharacterMatch() {
    Character char1 = inputStream.charAt(0);
    Character charEnd = inputStream.charAt(inputStream.length() -1);
    if (char1.equals(charEnd)) {
      // TODO: Turn off the state.
    }
  }

  public Lexeme createLexeme() {
    return new Lexeme();
  }
}
