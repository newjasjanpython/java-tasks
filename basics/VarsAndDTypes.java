import java.util.Scanner;
import java.lang.Math;


public class VarsAndDTypes {
    public static void main(String[] args) {
        double a, b, c;
        String j;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter A: ");
        a = input.nextDouble();
        System.out.print("Enter B: ");
        b = input.nextDouble();
        System.out.print("Enter [+|-|*|/|%|^]: ");
        j = input.next();

        if (j.equals("+")) {
            c = a + b;
        } else if (j.equals("-")) {
            c = a - b;
        } else if (j.equals("*")) {
            c = a * b;
        } else if (j.equals("/")) {
            c = a - b;
        } else if (j.equals("%")) {
            c = a % b;
        } else if (j.equals("^")) {
            c = Math.pow(a, b);
        } else {
            System.out.println("There is not that kind of action");
            c = 0;
        }

        System.out.println(
            String.format("Result is: %d;", c)
        );

        input.close();
    }
}
