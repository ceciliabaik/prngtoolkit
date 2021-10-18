package tokenizer;

import java.util.ArrayList;
import java.util.Arrays;

public class PublicInterface {
  private String activeToken;
  private boolean isActiveToken;
  private ArrayList<String> symbolTable;

  public PublicInterface() {
    symbolTable = new ArrayList<>();
  }

  public boolean isActiveToken() {
    return isActiveToken;
  }

  public void setActiveToken(boolean activeToken) {
    isActiveToken = activeToken;
  }

  public void traverseTokens(ArrayList<String> symbolTable) {
    while (!symbolTable.isEmpty() && !isActiveToken()) {
      for (int i = 1; i < symbolTable.size(); i++) {
        activeToken = symbolTable.get(i);
        if (activeToken.equals(initialToken())) {
          moveActiveTokenForward();
        } else if (activeToken.equals(lastToken())) {
          moveActiveTokenForward();
        } else if () {
          getEndToken();
        } else {
          throw new Exception("The token is not valid");
        }
      }  
    }
  }

  private String initialToken() {
    return symbolTable.get(0);
  }

  public String moveActiveTokenForward() {
    for (int i = 1; i < tokens.size(); i++) {
      if (isActiveToken()) {
        String activeToken = tokens.get(0;)
        String nextToken = tokens.get(i +=1);
        currentToken = nextToken;
        setActiveToken(nextToken);
        return nextToken;
      }
    }   
  }

  public String moveActiveTokenBackwards() {
    for (int i = tokens.size() -1; i >= 0; i--) {
      if (isActiveToken().equals(currentToken)) {
        String activeToken = tokens.get(i);
        String previousToken = tokens.get(i +=1);
        activeToken = previousToken;
        return previousToken.setActiveToken(true);
      }
    }
  }

  public String checkIfHasMoreTokens() {
    if (isEndOfTokens() && (a)ctiveToken > getEndToken())) 
      return new Token(Token.Type.END, "");
  }
  
  private boolean isEndOfTokens() {
    return symbolTable.isEmpty(); 
  }

  private String getEndToken() {
    return symbolTable.get(symbolTable.size() -1);
  }

  private String lastToken() {

  }
}
