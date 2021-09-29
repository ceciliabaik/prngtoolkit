package tokenizer;

public class Lexeme {
  private String inputStream;

  public Lexeme(String inputStream) {
    this.inputStream = inputStream;
  }

  public Lexeme() {}

  public String getInputStream() {
    return inputStream;
  }

  public void hej() {
    inputStream = "Meningen består av ord";
    for (int i = 0; i < inputStream.length(); i++) 
    System.out.println(inputStream.charAt(i));
  }

  public static void main(String[] args) {
    Lexeme lexeme = new Lexeme();
    lexeme.hej();
  }
}
