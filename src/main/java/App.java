import tokenizer.scanner.Start;
import tokenizer.scanner.StateMachine;

public class App {
  public static void main(String[] args) {
    StateMachine stateMachine = new StateMachine();
    stateMachine.setState(new Start(stateMachine));

    Start start = new Start();
    start.updateState();
  }
}
