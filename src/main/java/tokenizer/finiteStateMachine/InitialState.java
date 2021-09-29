package tokenizer.finiteStateMachine;

public class InitialState implements State {
  private Context context;
  private boolean isCharacterMatch;
  String inputStream;

    public InitialState(String inputStream) {
      this.inputStream = inputStream;
    }

    public InitialState() {
    }

    public boolean isCharacterMatch() {
        return isCharacterMatch;
    }

    public Character startOnFirstCharacter() {
      return inputStream.charAt(0);
    }

    @Override
    public void performTransition() {
      for (int i = 0; i < inputStream.length(); i++) 
        defineCharacterMatch();
    }

    public void defineCharacterMatch() {
      Character char1 = inputStream.charAt(0);
      Character char2 = inputStream.charAt(1);
      Character charEnd = inputStream.charAt(inputStream.length() -1);
      if (char1.equals(char2)) {
        context.setState(new NextState());
      } else if (char1.equals(charEnd)){
        context.setState(new AcceptState());
      } else {
        System.out.println("No more characters");
      }
    }

    @Override
    public void foundCharacterMatch() {
    }

    public boolean hasMoreCharacters() {
      // TODO: Return true or false.
    }
}
