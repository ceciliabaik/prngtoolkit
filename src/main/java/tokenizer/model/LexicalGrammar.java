// package tokenizer.model;

// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

// public class LexicalGrammar {
//   private Pattern pattern;
//   private Matcher matcher;

//   public boolean isLiteral(String sourceCode) {
//     pattern = Pattern.compile("[a-zA-Z]");
//     matcher = pattern.matcher(sourceCode);
//     return matcher.matches();
//   }
  
//   public boolean isDigit(String sourceCode) {
//     pattern = Pattern.compile("[0-9]");
//     matcher = pattern.matcher(sourceCode);
//     return matcher.matches();
//   }

//   public boolean isOperator(String sourceCode) {
//     pattern = Pattern.compile("[+][-][/][*][<][<=][=][>=][>]");
//     matcher = pattern.matcher(sourceCode);
//     return matcher.matches();
//   }

//   public boolean isEnd(String sourceCode) {
//     pattern = Pattern.compile("[0-9]");
//     matcher = pattern.matcher(sourceCode);
//     return matcher.matches();
//   }

//   public boolean isIdentifier(String sourceCode) {
//     pattern = Pattern.compile("");
//     matcher = pattern.matcher(sourceCode);
//     return matcher.matches();
//   }

//   public boolean isWhiteSpace(String sourceCode) {
//     pattern = Pattern.compile("");
//     matcher = pattern.matcher(sourceCode);
//     return matcher.matches();
//   }

//   public boolean isComment(String sourceCode) {
//     pattern = Pattern.compile("[/*][/**][//]");
//     matcher = pattern.matcher(sourceCode);
//     return matcher.matches();
//   }

//   public boolean isKeyword(String sourceCode) {
//     pattern = Pattern.compile("[if][else]");
//     matcher = pattern.matcher(sourceCode);
//     return matcher.matches();
//   }

//   public boolean isDot(String sourceCode) {
//     return sourceCode.matches("[.]");
//   }

//   private boolean isLiteral(char currentChar) {
//     StateMachine stateMachine = new StateMachine();
//     String sourceCode = stateMachine.getSourceCode();
//     Pattern pattern = Pattern.compile("[a-zA-Z]");
//     Matcher matcher = pattern.matcher(sourceCode);
//     return matcher.matches();
//   }
// }
