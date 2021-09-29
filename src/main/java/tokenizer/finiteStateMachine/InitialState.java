package tokenizer.finiteStateMachine;

public class InitialState implements State {
  private Context context;
  String inputStream = "Piningen består av ord";

    public InitialState(String inputStream) {
      this.inputStream = inputStream;
    }

    public InitialState() {
    }

    public Character startOnFirstCharacter() {
      return inputStream.charAt(0);
    }

    public void defineCharacterMatch() {
      Character char1 = inputStream.charAt(0);
      Character char2 = inputStream.charAt(1);
      if (char1.equals(char2)) {
        context.setState(new NextState());
      }
    }

    @Override
    public void performTransition() {
      for (int i = 0; i < inputStream.length(); i++) {
        defineCharacterMatch();
      }
    }

    public static void main(String[] args) {
      InitialState initialState = new InitialState();
      initialState.performTransition();
    }
}
