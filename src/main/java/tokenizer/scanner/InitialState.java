package tokenizer.scanner;

import tokenizer.lexicalGrammar.LexicalGrammar;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.EnumMap;

public class InitialState implements FiniteStateMachine {
  private static final InitialState instance = new InitialState();

  public InitialState() {
  }

  public static InitialState instance() {
    return instance;
  }

  public Character startOnFirstCharacter(String inputStream) {
    if (inputStream.isEmpty()) 
      throw new NullPointerException("Input stream is empty.");
    else
      return inputStream.charAt(0);
  }

  public void identifyLexemes(String inputStream, String regex) {
    for (int i = 0; i < inputStream.length(); i++)
      matchCharWithPattern(inputStream, regex);
  }

  public Boolean matchCharWithPattern(String inputStream, String regex) {
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(inputStream);
    return matcher.matches();
  }

  @Override
  public void performTransition(ScannerContext context, String inputStream) {
    Character firstChar = inputStream.charAt(0);
    Character lastChar = inputStream.charAt(inputStream.length() -1);
    for (int i = 0; i < inputStream.length(); i++) {
      if (firstChar.equals(lastChar)) {
        Character nextChar = inputStream.charAt(i + 1);
        context.setState(AcceptState.instance());
      else if () 
        context.setState(NextState.instance());
      }  
    }
  }
}
