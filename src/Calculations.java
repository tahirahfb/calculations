import java.util.Scanner;
import java.text.DecimalFormat;

public class Calculations {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Enter a number:");
        double num1 = Double.valueOf(input.nextLine());

        System.out.println("Enter another number:");
        double num2 = Double.valueOf(input.nextLine());

        //Addition
        double add = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + add);

        //Subtraction
        double sub = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + df.format(sub));

        //Multiplication
        double multi = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + df.format(multi));

        //Division
        double div = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + df.format(div));

        //Modulus
        double mod = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + mod);
    }
}
