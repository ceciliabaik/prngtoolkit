package tokenizer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class SearchPattern {

    public void defineSearchPatternWordAndDot() {
      Pattern pattern = Pattern.compile("([a-zåäöA-ZÅÄÖ]*)\\s*(.*)(!*)\\?*(:*)(;*)(,*)");
      Matcher matcher = pattern.matcher("Meningen: består; av, ord hej! på, dig");
      boolean bool = matcher.matches();
      System.out.println(bool);
    }

    public void defineSearchPatternArithmetic() {
      Pattern pattern = Pattern.compile("(\\d*)\\+*\\s*([0-9]*)"); 
      Matcher matcher = pattern.matcher("6 + 90 - 45");
      boolean bool = matcher.matches();
      System.out.println(bool);
    }

    public void whiteSpace() {
      Pattern pattern = Pattern.compile("(\\d*)\\+*\\s*([0-9]*)"); 
      Matcher matcher = pattern.matcher("6 + 90 - 45");
      boolean bool = matcher.matches();
      System.out.println(bool);
    }

    public void moveActiveTokenForward() {
      // ArrayList<String> tokens = "Meningen", "består", "av", "ord", "."};
      // for (int i = 0; i < tokens.length; i++) {
      //   System.out.println(tokens[i]);
      // }
    }

    public void moveActiveTokenBackwards() { 
      // ArrayList<String> tokens = new ArrayList<>(Arrays.asList("Meningen", "består", "av", "ord", ".");
      // for (int i = tokens.size() -1; i >= 0; i--) {
      //   System.out.println(tokens.get(i));
      // }
    }

    public void getActiveToken() {
        ArrayList<String> tokens = new ArrayList<String>
                (Arrays.asList("Meningen", "består", "av", "ord", "."));
        String activeToken = tokens.get(0);
        System.out.println(activeToken);
    }
  

    // public void spliStringIntoTokenWithSpaceDelimiter() {
    //     String text = "Meningen består av ord.";
    //     String[] result = text.split(" ");
    //     System.out.println(Arrays.toString(result));
    // }

    // public Matcher getStringToMatchSearchPattern(String inputSourceCode) {
    //     return pattern.matcher(inputSourceCode);
    // }

    // public Matcher defineTokensByRegularExpressions(String inputSourceCode) {
    //   return pattern.matcher(inputSourceCode);
    // }

    // public Matcher identifyTokens(String inputSourceCode) {
    //   return pattern.matcher(inputSourceCode);
    // }

    // public Boolean foundMatchesBetweenSearchPatternAndString() {
    //     return matcher.matches();
    // }
    public static void main(String[] args) {
      SearchPattern pattern = new SearchPattern();
      pattern.defineSearchPatternWordAndDot();
      pattern.defineSearchPatternArithmetic();
      pattern.moveActiveTokenForward();
      pattern.moveActiveTokenBackwards();
      pattern.getActiveToken();
    }
}

