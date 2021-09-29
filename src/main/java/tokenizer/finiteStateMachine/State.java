package tokenizer.finiteStateMachine;

public interface State {
  void performTransition();
  void foundCharacterMatch();
}
