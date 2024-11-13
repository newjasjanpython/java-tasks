import java.util.Scanner;


public class TerminalCalculator {
	public static void main(String[] args) {
		System.out.println("Terminal Calculator\n\n################\n");

    Scanner iPut = new Scanner(System.in);

		System.out.println("Enter A Number: ");
    double inputA = iPut.nextDouble();
		System.out.println("Choose [+|-|*|/]: ");
		String arOp = iPut.next();
		System.out.println("Enter B Number: ");
    double inputB = iPut.nextDouble();

		switch (arOp) {
      case "+":
				System.out.println(String.format("Result: %.2f + %.2f = %.2f\n", inputA, inputB, inputA + inputB));
				break;
			case "-":
				System.out.println(String.format("Result: %.2f - %.2f = %.2f\n", inputA, inputB, inputA - inputB));
		    break;
		}

		iPut.close();
	}
}

