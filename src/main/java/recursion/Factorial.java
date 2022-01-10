package recursion;

public class Factorial {

  public int generateFactorial(int number) {
    System.out.println("number = " + number);
    if (number <= 1) {
      return 1;
    }
    int fact = generateFactorial(number - 1);
    System.out.println("(number-1)! = " + fact);
    return number * fact;
  }

  public static void main(String[] args) {
    Factorial factorial = new Factorial();
    int result = factorial.generateFactorial(4);
    System.out.println("result = " + result);
  }
}
