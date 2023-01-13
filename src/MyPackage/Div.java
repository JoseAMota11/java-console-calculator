package MyPackage;

public class Div {
  protected static void DivideTwoNumbers(int num1, int num2) {
    try {
      System.out.println(num1 / num2);
    } catch (ArithmeticException e) {
      System.out.println("Cannot multiply by 0.");
    }
  }
}