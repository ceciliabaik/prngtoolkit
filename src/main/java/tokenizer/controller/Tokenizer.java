// package tokenizer.controller;
// package tokenizer.evaluator;

// import tokenizer.model.Token;
// import tokenizer.view.Console;

// import java.util.ArrayList;
// import java.util.Arrays;

// public class Tokenizer {
//   private Token token;
//   private Console console;
//   private final ArrayList<String> symbolTable;

//   public Tokenizer(Token token) {
//     this.token = token;
//     symbolTable = new ArrayList<>(Arrays.asList());
//   }

//   public void Tokenization() {
//     while (!lexemeList.isEmpty()) {
//       for (int i = 0; i < lexemeList.size(); i++) {
//         Lexeme currentLexeme = lexemeList.get(i);
//         if (String.isLiteral(currentLexeme)) {
//           createToken(Token.Type.LITERAL, token.getValue());
//         } else if (String.isInteger(currentLexeme)) {
//           createToken(Token.Type.INTEGER, token.getValue());
//         } else if (String.isFloat(currentLexeme)) {
//           createToken(Token.Type.FLOAT, token.getValue());
//         } else if (String.isOperator(currentLexeme)) {
//           createToken(Token.Type.OPERATOR, token.getValue());
//         } else if (String.isSeparator(currentLexeme)) {
//           createToken(Token.Type.SEPARATOR, token.getValue());
//         } else if (String.isEnd(currentLexeme)) {
//           createToken(Token.Type.END, token.getValue());
//         } else if (String.isInvalid(currentLexeme)){
//           throw new Exception("No lexical element matches " + token.getValue());
//         }
//       } 
//     }
//   }

//   private Token createToken(Token.Type name, String value) {
//     return new Token(name, value);
//   }

//   private ArrayList<String> addTokensToSymbolTable() {
//     return symbolTable.addAll();
//   }

//   public void updateView() {
//     console.show
//   }
// }
