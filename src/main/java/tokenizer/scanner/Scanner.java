package tokenizer.scanner;

public class Scanner {
  private FiniteStateAutomaton state;

  public Scanner() {
    state = InitialState.instance();
  }

  public FiniteStateAutomaton getState() {
    return state;
  }

  public void setState(FiniteStateAutomaton state) {
    this.state = state;
  }

  public void transition() {
    state.transition(this);
  }
}
