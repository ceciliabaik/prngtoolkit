package tokenizer.finiteStateMachine;

public class Context {
    private State state;

    public Context() {
      state = new InitialState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
