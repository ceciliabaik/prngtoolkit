package tokenizer.view;

import java.util.Scanner;

public class Console {

  public void handleUserInput() {
    String userInput = "";
    Scanner scan = new Scanner(System.in);
   
    try {
      System.out.print("Enter an expression: ");
      userInput = scan.nextLine();
      System.out.println(userInput);
      } catch (Exception e) {
        System.out.println("The imput is empty");
      }
    }
}
