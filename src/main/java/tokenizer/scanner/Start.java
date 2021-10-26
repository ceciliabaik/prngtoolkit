package tokenizer.scanner;

public class Start extends SuperState {
  private static final Start instance = new Start();

  public Start(StateMachine stateMachine) {
    super(stateMachine);
  }

  public Start() {}

  public static Start getInstance() {
    return instance;
  }

  @Override
  public void updateState() {
    String sourceCode = " Meningen består av ord.";

    int i = 0;
    while (i < sourceCode.length()) {
      char currentChar = sourceCode.charAt(i);
      System.out.println(currentChar);
      i++;
      if (Character.isWhitespace(currentChar)) {
        System.out.println("currentChar");
      }
      
    }
  }
}

 
 
