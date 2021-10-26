package tokenizer.model;
// package tokenizer;

// import java.util.ArrayList;
// import java.util.Arrays;

// public class PublicInterface {
//   private boolean isActiveToken;
//   private ArrayList<String> symbolTable;

//   public PublicInterface() {
//     symbolTable = new ArrayList<>();
//   }

//   public boolean isActiveToken() {
//     return isActiveToken;
//   }

//   public void setActiveToken(boolean activeToken) {
//     isActiveToken = activeToken;
//   }

//   public void traverseTokens(ArrayList<String> symbolTable) {
//     while (!symbolTable.isEmpty()) {
//       for (int i = 0; i < symbolTable.size(); i++) {
//         String currentToken = symbolTable.get(i);
//         if (isInitialToken(currentToken) && !isActiveToken()) {
//           setActiveToken(true);
//           String activeToken = getInitalToken();
//         } else if (isActiveToken() && isNextToken(currentToken)) {
//           moveActiveTokenForward();
//         } else if (isActiveToken() && isPreviousToken(currentToken)) {
//           moveActiveTokenBackwards();
//         } else if (!hasMoreTokens()) {
//           getEndToken();
//         } else {
//           throw new Exception("The token is not valid");
//         }
//       }
//     }  
//   }

//   private boolean isInitialToken(String currentToken) {
//     return currentToken.equals(symbolTable.get(0));
//   }
  
//   private String getInitalToken() {
//     return symbolTable.get(0);
//   }

//   private boolean isNextToken(String currentToken) {
//     return null;
//   }

//   public String moveActiveTokenForward() {
//     String nextToken;
//     return nextToken;

//   }

//   private boolean isPreviousToken(String currentToken) {
//     return null;
//   }

//   public String moveActiveTokenBackwards() {
//     for (int i = tokens.size() -1; i >= 0; i--) {
//       if (isActiveToken().equals(currentToken)) {
//         String activeToken = tokens.get(i);
//         String previousToken = tokens.get(i +=1);
//         activeToken = previousToken;
//         return previousToken.setActiveToken(true);
//       }
//     }
//   }

//   public boolean hasMoreTokens() {
//     if (isEndOfTokecheckIfHasns() && activeToken > getEndToken())) 
//       return new Token(Token.Type.END, "");
//   }
  
//   private boolean isEndOfTokens() {
//     return symbolTable.isEmpty(); 
//   }

//   private String getEndToken() {
//     return symbolTable.get(symbolTable.size() -1);
//   }

//   private void delimitIntoToken() {

//   }
// }
