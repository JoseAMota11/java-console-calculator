package MyPackage;

import java.util.Scanner;

public class AskToTheUser {
  Scanner userInput1 = new Scanner(System.in);
  Scanner userInput2 = new Scanner(System.in);
  Scanner operationType = new Scanner(System.in);

  void makeCalculation() {
    System.out.println("What kind of operation do you want to make? ");
    System.out.println("1. Sum");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiply");
    System.out.println("4. Division");
    System.out.print("Option: ");
    String op = operationType.next();

    System.out.print("Type the first number: ");
    int num1 = userInput1.nextInt();
    System.out.print("Type the second number: ");
    int num2 = userInput2.nextInt();

    System.out.print("Result: ");

    switch (op) {
      case "1":
        Calculate.Add(num1, num2);
        break;
      case "2":
        Calculate.Sub(num1, num2);
        break;
      case "3":
        Calculate.Mul(num1, num2);
        break;
      case "4":
        Calculate.Div(num1, num2);
        break;
      default:
        System.out.println("Invalid option");
    }
  }
}